package com.vn.bookinghotel.viewbo;

public class roomView {
	private int idRoom;
	private String img;
	private String rName;
	private String detail;
	private int price;
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public roomView(int idRoom, String img, String rName, String detail, int price) {
		super();
		this.idRoom = idRoom;
		this.img = img;
		this.rName = rName;
		this.detail = detail;
		this.price = price;
	}
	public roomView() {
		super();
		
	}
}
