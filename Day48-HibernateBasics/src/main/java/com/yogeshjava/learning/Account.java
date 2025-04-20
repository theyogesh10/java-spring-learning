package com.yogeshjava.learning;

public class Account {
	
	int actId;
	String actName;
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
		
	public Account(int v1, String v2, float v3) {
		actId=v1;
		actName=v2;
		balance=v3;
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

}
