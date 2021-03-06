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

import beans.Inquiry;
import dao.InquiryDAO;

/**
 * Servlet implementation class UserSupportList
 */
@WebServlet("/UserSupportList")
public class UserSupportList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserSupportList() {
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
			InquiryDAO inquirydao=new InquiryDAO();
			List<Inquiry> inquiryList=inquirydao.showAllInquiry();

			request.setAttribute("inquiryList", inquiryList);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersupportlist.jsp");
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
			String itemName=request.getParameter("itemName");
			String customerName=request.getParameter("customerName");

			InquiryDAO inquirydao=new InquiryDAO();
			List<Inquiry> inquiryList=inquirydao.searchInquiry(itemName, customerName);

			request.setAttribute("inquiryList", inquiryList);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersupportlist.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}

	}

}
