package com.vn.bookinghotel.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.bookinghotel.bo.User;
import com.vn.bookinghotel.dao.UserDAO;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet(name = "userList", urlPatterns = { "/userList" })
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
        ArrayList<User> userList = userDAO.getAllUser();
        
        request.setAttribute("userList", userList);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/userList.jsp"); 
		dispatcher.forward(request, response);
}	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
