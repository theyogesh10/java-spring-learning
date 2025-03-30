package com.yogeshjava.learning;

public class UserVerification {
	
	public boolean isValid(String userName, String password) {
		if(userName.equals("Java") && password.equals("java")) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
