package customerservice;

import java.io.IOException;

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
 * Servlet implementation class UserSupportConfirm
 */
@WebServlet("/UserSupportConfirm")
public class UserSupportConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserSupportConfirm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
			int itemId=Integer.parseInt(request.getParameter("itemId"));
			String inquiryContents=request.getParameter("inquiryContents");

			Inquiry inquiry=new Inquiry();
			inquiry.setCustomerId(customerId);
			inquiry.setItemId(itemId);
			inquiry.setInquiryContents(inquiryContents);

			InquiryDAO inquirydao=new InquiryDAO();

			int count=inquirydao.insertInquiry(inquiry);

			request.setAttribute("count", count);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersupportconfirm.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}
	}

}
