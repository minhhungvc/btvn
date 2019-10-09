package com.vn.bookinghotel.viewutils;

import java.util.ArrayList;

import org.apache.tomcat.util.codec.binary.Base64;

import com.vn.bookinghotel.bo.Room;
import com.vn.bookinghotel.viewbo.roomView;

public class roomUtils {
public static ArrayList<roomView> convertToRoomViewList(ArrayList<Room> roomList){
		
		ArrayList<roomView> roomViewList = new ArrayList<roomView>();
		for (Room room: roomList) {
			roomViewList.add(convertToRoomView(room));
			
		}
		return roomViewList;
	}
	
	public static roomView convertToRoomView(Room room){
		roomView roomView = new roomView();
		roomView.setIdRoom(room.getIdRoom());	
		String photoEncode=Base64.encodeBase64String(room.getImg());
		roomView.setImg(photoEncode);
		roomView.setrName(room.getrName());		
		roomView.setDetail(room.getDetail());		
		roomView.setPrice(room.getPrice());
		return roomView;
	}
}
