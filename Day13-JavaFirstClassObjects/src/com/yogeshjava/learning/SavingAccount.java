package com.yogeshjava.learning;

public class SavingAccount extends Account {
	
	int actId;
	String actName;
	float balance;
	static float intRate;
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(int v1, String v2, float v3) {
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
	
	public float getIntRate() {
		return intRate;
	}
	
	public void setIntRate(float intRate) { 
		this.intRate = intRate; 
	}
	
	public static void initializeStaticVars() {
		intRate=0.04f;
	}
	 

}
