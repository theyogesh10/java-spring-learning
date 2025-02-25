package com.yogeshjava.learning;

public class SalaryAccount extends SavingsAccount {
	
	int lastTransactionGap;

	public SalaryAccount() {
		
	}
	
	public SalaryAccount(int v1, String v2, float v3, long v4, float v5, int v6) {
		super(v1,v2,v3,v4,v5);
		lastTransactionGap = v6;	
	}

	public int getLastTransactionGap() {
		return lastTransactionGap;
	}

	public void setLastTransactionGap(int lastTransactionGap) {
		this.lastTransactionGap = lastTransactionGap;
	}
	
	public void calcInterest() {
		System.out.println("Salary Account - calcInterest " + lastTransactionGap);
	}	
	
}
