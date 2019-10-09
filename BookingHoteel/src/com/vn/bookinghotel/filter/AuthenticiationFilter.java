package com.vn.bookinghotel.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticiationFilter
 */
@WebFilter({"/userList","/deleteUser","/createUser","/deleteUser","/deleteCustomer","/updateCustomer","/customerList","/searchCustomer","/deleteRoom","/updateRoom","/createRoom"})
public class AuthenticiationFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpreq = (HttpServletRequest) request;
		HttpSession session = httpreq.getSession(false);
		if(session != null && session.getAttribute("userName") != null) {
		chain.doFilter(request, response);
		
		}else {
			RequestDispatcher dispatcher = httpreq.getServletContext().getRequestDispatcher("/WEB-INF/view/loginUser.jsp");
			dispatcher.forward(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}