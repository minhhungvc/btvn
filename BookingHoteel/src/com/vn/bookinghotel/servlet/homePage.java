package com.vn.bookinghotel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homePage
 */
@WebServlet(name = "home", urlPatterns = { "/home" })
public class homePage extends HttpServlet {
	
	

private static final long serialVersionUID = 1L;
 	@Override
 		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
 				throws ServletException, IOException {
 		RequestDispatcher dispatcher = 
 				this.getServletContext().getRequestDispatcher("/WEB-INF/view/homePage.jsp");
 			dispatcher.forward(req, resp);
 			
 		}
 	@Override
 		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
 				throws ServletException, IOException {
 			
 			doGet(req, resp);
 		}



}