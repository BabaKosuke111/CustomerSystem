package customerservice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Customer;
import dao.CustomerDAO;

/**
 * Servlet implementation class UserResistConfirm
 */
@WebServlet("/UserResistConfirm")
public class UserResistConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserResistConfirm() {
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

			String customerName=request.getParameter("customerName");
			String customerNamekana=request.getParameter("customerNamekana");
			String postalCode=request.getParameter("postalCode");
			String address=request.getParameter("address");

			Customer customer=new Customer();
			customer.setCustomerName(customerName);
			customer.setCustomerNameKana(customerNamekana);
			customer.setPostalCode(postalCode);
			customer.setAddress(address);

			CustomerDAO customerdao=new CustomerDAO();
			int count=customerdao.insertCustomer(customer);

			request.setAttribute("count", count);
			request.setAttribute("customer", customer);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userregistconfirm.jsp");
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
