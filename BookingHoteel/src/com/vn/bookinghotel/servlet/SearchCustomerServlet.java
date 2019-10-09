package com.vn.bookinghotel.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.bookinghotel.bo.Customer;
import com.vn.bookinghotel.dao.CustomerDAO;

/**
 * Servlet implementation class SearchCustomerServlet
 */
@WebServlet(name = "searchCustomer", urlPatterns = { "/searchCustomer" })
public class SearchCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCard=(String)request.getParameter("idCard");
		CustomerDAO customerDAO = new CustomerDAO();
		ArrayList<Customer> customerList = customerDAO.findCustomerByName(idCard);
	
		request.setAttribute("customerList", customerList);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/customerList.jsp"); 
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
