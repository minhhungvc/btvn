package com.vn.bookinghotel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vn.bookinghotel.bo.User;
import com.vn.bookinghotel.dao.UserDAO;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet(name = "loginUser", urlPatterns = { "/loginUser" })
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/loginUser.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = (String) request.getParameter("userName");
		String password = (String) request.getParameter("password");
		UserDAO userDao = new UserDAO();
		User user = userDao.findUserByUsernameAndPassword(userName, password);
		if (user == null) {
			request.setAttribute("error", "Login Faile");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/loginUser.jsp");
			dispatcher.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("userName", user.getUserName());
			session.setAttribute("roles", user.getRoles());
			response.sendRedirect(request.getContextPath() + "/home");
		}

	}

}
