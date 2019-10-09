package com.vn.bookinghotel.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.vn.bookinghotel.bo.Room;
import com.vn.bookinghotel.dao.RoomDAO;

/**
 * Servlet implementation class CreateRoomServlet
 */
@WebServlet(name = "createRoom", urlPatterns = { "/createRoom" })
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class CreateRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/createRoom.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idRoomStr =(String) request.getParameter("idRoom");
		int idRoom = Integer.parseInt(idRoomStr);
		String rName = (String) request.getParameter("rName");
		String detail = (String) request.getParameter("detail");
		String priceStr = (String) request.getParameter("price");
		int price = Integer.parseInt(priceStr);

	     InputStream inputStream = null;
	     Part filePart = request.getPart("img");
	     if (filePart != null) {

            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());



            inputStream = filePart.getInputStream();
         }
	        Room room =new Room();
		    room.setIdRoom(idRoom);
		    room.setImg(readFile(inputStream));
			room.setrName(rName);
			room.setDetail(detail);
			room.setPrice(price);
			
	     
			RoomDAO roomDAO = new RoomDAO();
			roomDAO.addRoom(room);
			
			response.sendRedirect(request.getContextPath() + "/roomList");
		}
	
	private static byte[] readFile(InputStream inputStream) {
		ByteArrayOutputStream bos = null;
		try {
			byte[] buffer = new byte[1024];
			bos = new ByteArrayOutputStream();
			for (int len; (len = inputStream.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
			
		} catch (Exception e) {
            System.err.println(e.getMessage());
        }
		return bos.toByteArray();
	}

}