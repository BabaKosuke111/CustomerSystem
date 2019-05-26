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
 * Servlet implementation class UserSupportAnswerConfirm
 */
@WebServlet("/UserSupportAnswerConfirm")
public class UserSupportAnswerConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSupportAnswerConfirm() {
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
			int inquriyId=Integer.parseInt(request.getParameter("inquiryId"));
			String replyContents=request.getParameter("replyContents");

			Inquiry inquiry=new Inquiry();
			inquiry.setInquiryId(inquriyId);
			inquiry.setReplyContents(replyContents);

			InquiryDAO inquirydao=new InquiryDAO();
			int count=inquirydao.updateInquiry(inquiry);

			request.setAttribute("count", count);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersupportanswerconfirm.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}
	}
}
