package customerservice;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Customer;
import beans.Item;
import dao.CustomerDAO;
import dao.ItemDAO;

/**
 * Servlet implementation class UserSupport
 */
@WebServlet("/UserSupport")
public class UserSupport extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSupport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		try {
			ItemDAO itemdao=new ItemDAO();
			List<Item> itemList=itemdao.showAllItem();

			CustomerDAO customerdao=new CustomerDAO();
			List<Customer> customerList=customerdao.showAllCustomer();

			request.setAttribute("itemList", itemList);
			request.setAttribute("customerList", customerList);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersupport.jsp");
		dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
