package com.vn.bookinghotel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.vn.bookinghotel.dao.CustomerDAO;

import com.vn.bookinghotel.bo.Customer;

/**
 * Servlet implementation class CreateCustomerServlet
 */
@WebServlet(name = "createCustomer", urlPatterns = { "/createCustomer" })
public class CreateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/view/createCustomer.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idRoomStr = request.getParameter("idRoom");
		int idRoom = Integer.parseInt(idRoomStr);
		String idCard = (String) request.getParameter("idCard");
		String fullName = (String) request.getParameter("fullName");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);
		String telephone = (String) request.getParameter("telephone");
        String checkInDate = (String) request.getParameter("checkInDate");
		String checkOutDate = (String) request.getParameter("checkOutDate");
		String email = (String) request.getParameter("email");

		Customer customer = new Customer();
		customer.setIdRoom(idRoom);
		customer.setIdCard(idCard);
		customer.setFullName(fullName);
		customer.setAge(age);
		customer.setTelephone(telephone);
		customer.setCheckInDate(checkInDate);
		customer.setCheckOutDate(checkOutDate);
		customer.setEmail(email);

		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.addCustomer(customer);

		response.sendRedirect(request.getContextPath() + "/successBook");
	}

}