package com.yogeshjava.learning;

public class SavingAccount extends Account {
	
	float minBalance;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(int v1, String v2, float v3, float v4, float v5) {
		super(v1, v2, v3, v4);
		minBalance=v5;
	}
	
	public float getMinBalance() {
		return minBalance;
	}
	
	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	 
	public void calcInterest() {
		System.out.println(interestRate);
		System.out.println("Saving Account - Interest");
	}

}
