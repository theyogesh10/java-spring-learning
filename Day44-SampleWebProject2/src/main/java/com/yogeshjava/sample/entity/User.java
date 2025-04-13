package com.yogeshjava.sample.entity;

public class User {
	
	String user;
	String pass;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String v1, String v2) {
		user = v1;
		pass = v2;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
