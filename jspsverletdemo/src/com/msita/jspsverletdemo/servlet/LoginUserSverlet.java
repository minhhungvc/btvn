package com.msita.jspsverletdemo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.msita.jspsverletdemo.bo.User;
import com.msita.jspsverletdemo.dao.UserDAO;

/**
 * Servlet implementation class LoginUserSverlet
 */
@WebServlet(name = "loginUser", urlPatterns = { "/loginUser" })
public class LoginUserSverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginUserSverlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
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
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		UserDAO userDao = new UserDAO();
		User user = userDao.findUserByUsernameAndPassword(username, password);
		if (user == null) {
			request.setAttribute("error", "Login Faile");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/loginUser.jsp");
			dispatcher.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("username", user.getName());
			session.setAttribute("roles", user.getRoles());
			response.sendRedirect(request.getContextPath() + "/home");
		}

	}

}
