package com.vn.bookinghotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.bookinghotel.dao.CustomerDAO;

/**
 * Servlet implementation class DeleteCustomerServlet
 */
@WebServlet(name = "deleteCustomer", urlPatterns = { "/deleteCustomer" })
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
   	protected void doGet(HttpServletRequest request, HttpServletResponse response)
   			throws ServletException, IOException {
   		String idCardstr = (String) request.getParameter("idCard");
   		int idCard = Integer.parseInt(idCardstr);
   		CustomerDAO customerDAO = new CustomerDAO();
   		customerDAO.deleteCustomer(idCard);
   		response.sendRedirect(request.getContextPath() + "/customerList");
   	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
