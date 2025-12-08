package com.yogeshjava.Day67_SpringBootInterServices;

//This is known as Entity class / Value Object / Data Transfer Object (DTO)


public class User {

	String user;
	String pass;

	public User() {
		
	}
	
	public User(String v1, String v2) {
		user=v1;
		pass=v2;
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
