package com.yogeshjava.learning;

public class VerificationProcess {
	
	public boolean isValid(User user) {
		
		DataAccess ref=new DatabaseConnectivity();
		boolean value=ref.retrieve(user);
		return value;
	}
	

}
