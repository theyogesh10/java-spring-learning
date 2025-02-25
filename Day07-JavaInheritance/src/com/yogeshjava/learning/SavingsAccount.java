package com.yogeshjava.learning;

public class SavingsAccount extends Account{
	float minBalance;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int v1, String v2, float v3, long v4, float v5) {
		// By default JVM executes super();
		super(v1,v2,v3,v4);
		name = v2.toUpperCase();
		minBalance = v5;
	}
	
	public void withdraw(float amt) {
		System.out.println("Saving Account withdraw method");
		
	}

}
