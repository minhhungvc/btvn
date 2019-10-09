package com.vn.bookinghotel.bo;

public class User {
	private int idUser;
	private String userName;
	private String password;
	private String roles;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public User(int idUser, String userName, String password, String roles) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	public User() {
		super();
	}
}
