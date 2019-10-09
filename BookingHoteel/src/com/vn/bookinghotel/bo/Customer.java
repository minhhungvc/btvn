package com.vn.bookinghotel.bo;

public class Customer {
	private int idRoom;
	private String idCard;
	private String fullName;
	private int age;
	private String telephone;
	private String checkInDate;
	private String checkOutDate;
	private String email;

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(int idRoom, String idCard, String fullName, int age, String telephone, String checkInDate,
			String checkOutDate, String email) {
		super();
		this.idRoom = idRoom;
		this.idCard = idCard;
		this.fullName = fullName;
		this.age = age;
		this.telephone = telephone;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.email = email;
	}

	public Customer() {
		super();
	}

	

	  
}
