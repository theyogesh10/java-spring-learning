package com.yogeshjava.learning;

public class User {

	String userId;
	String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String v1, String v2) {
		userId=v1;
		password=v2;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}


