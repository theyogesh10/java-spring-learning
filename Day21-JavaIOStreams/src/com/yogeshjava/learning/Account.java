package com.yogeshjava.learning;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int actId;
	private String actName;
	float balance;
	float interestRate;

	public Account() {
		interestRate=0.04f;
		
	}
	
	public Account(int v1, String v2, float v3, float v4) {
		actId=v1;
		actName=v2;
		balance=v3;
		interestRate=v4;
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(float amount) {
		balance+=amount;
	}
	
	// This has become a library function
	public void withdraw(float amount) throws LowBalanceException {
		
			if(balance>=amount) {
				balance-=amount;				
			}
			else {
				// We need JVM to stop execution here
				throw new LowBalanceException("Insufficient Balance...!");		
		} 
	
		
	}
	

	
	
	
}
