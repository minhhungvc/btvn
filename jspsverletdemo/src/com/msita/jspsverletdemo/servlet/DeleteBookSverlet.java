package com.msita.jspsverletdemo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msita.jspsverletdemo.dao.BookDAO;

/**
 * Servlet implementation class DeleteBookSverlet
 */
@WebServlet(name = "deleteBook", urlPatterns = { "/deleteBook" })
public class DeleteBookSverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookSverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String idstr = (String) request.getParameter("id");
		int id = Integer.parseInt(idstr);
		BookDAO bookDAO = new BookDAO();
		bookDAO.deleteBook(id);
		response.sendRedirect(request.getContextPath() + "/bookList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
