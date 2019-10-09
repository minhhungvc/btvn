package com.vn.bookinghotel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.bookinghotel.bo.User;
import com.vn.bookinghotel.dao.UserDAO;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet(name = "updateUser", urlPatterns = { "/updateUser" })
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idUserStr  = (String) request.getParameter("idUser");
		int idUser = Integer.parseInt(idUserStr);

		UserDAO userDAO = new UserDAO();
		User user = userDAO.getUser(idUser);

		request.setAttribute("user", user);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/updateUser.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idUserStr = request.getParameter("idUser");
		int idUser = Integer.parseInt(idUserStr);
		String userName = (String) request.getParameter("userName");
		String password = (String) request.getParameter("password");
		String roles = (String) request.getParameter("roles");

		User user = new User();
		user.setIdUser(idUser);
		user.setUserName(userName);
		user.setPassword(password);
		user.setRoles(roles);

		UserDAO userDAO = new UserDAO();
		userDAO.updateUser(user);

		response.sendRedirect(request.getContextPath() + "/userList");

		
	}

}
