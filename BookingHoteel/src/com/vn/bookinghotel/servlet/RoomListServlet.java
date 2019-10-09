package com.vn.bookinghotel.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.bookinghotel.bo.Room;
import com.vn.bookinghotel.dao.RoomDAO;
import com.vn.bookinghotel.viewbo.roomView;
import com.vn.bookinghotel.viewutils.roomUtils;

/**
 * Servlet implementation class RoomListServlet
 */
@WebServlet(name = "roomList", urlPatterns = { "/roomList" })
public class RoomListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoomListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDAO roomDAO = new RoomDAO();
        ArrayList<Room> roomList = roomDAO.getAllRoom();
        ArrayList<roomView> roomViewList = roomUtils.convertToRoomViewList(roomList);
        
        request.setAttribute("roomList", roomViewList);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/roomList.jsp"); 
		dispatcher.forward(request, response);
}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
