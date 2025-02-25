package com.yogeshjava.learning;

public abstract class Account {
	
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
	
	public void deposit(float amount) {
		balance+=amount;
	}
	
	public void withdraw(float amount) {
		balance-=amount;	
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public abstract void calcInterest();
	
}
