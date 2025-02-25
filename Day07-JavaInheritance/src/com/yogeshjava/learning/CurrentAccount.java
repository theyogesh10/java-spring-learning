package com.yogeshjava.learning;


public class CurrentAccount extends Account {
	float creditLimit;
	
	public CurrentAccount() {
		
	}
	public CurrentAccount(int v1, String v2, float v3, long v4, float v5) {
		super(v1,v2,v3,v4);
		creditLimit = v5;	
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float amt) {
		System.out.println("Current Account withdraw method");
		
	}
	
	

}
