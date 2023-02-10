package com.vbmart.dto;

public class UserDTO {
	
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userRole;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswpord() {
		return userPassword;
	}

	public void setUserPasswpord(String userPasswpord) {
		this.userPassword = userPasswpord;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}


}
