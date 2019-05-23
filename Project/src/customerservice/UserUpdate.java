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
 * Servlet implementation class UserUpdate
 */
@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserUpdate() {
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

			int customerId=Integer.parseInt(request.getParameter("customerId"));

			CustomerDAO customerdao=new CustomerDAO();
			Customer customer=customerdao.showCustomer(customerId);

			request.setAttribute("customer", customer);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userupdate.jsp");
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
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		try {

			int customerId=Integer.parseInt(request.getParameter("customerId"));
			String customerName=request.getParameter("customerName");
			String customerNameKana=request.getParameter("customerNameKana");
			String postalCode=request.getParameter("postalCode");
			String address=request.getParameter("address");

			Customer customer=new Customer();
			customer.setCustomerId(customerId);
			customer.setCustomerName(customerName);
			customer.setCustomerNameKana(customerNameKana);
			customer.setPostalCode(postalCode);
			customer.setAddress(address);

			CustomerDAO customerdao=new CustomerDAO();
			int count=customerdao.updateCustomer(customer);

			request.setAttribute("count",count);

			response.sendRedirect("UserList");

		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}

	}

}
