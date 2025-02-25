package com.yogeshjava.learning;

// This is known as an entity class / bean / POJO (Plan old java object) / VO / DTO
public class Account {
	
	int accNo;
	String name;
	float balance;
	long contactNo;

	public Account() {
		accNo = 12;
	
	}
	
	public Account(int v1, String v2, float v3, long v4) {
		accNo = v1;
		name = v2;
		balance = v3;
		contactNo = v4;	
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public  void deposit(float amount) {
		balance += amount;
	}
	
	public void withdraw(float amount) {
		System.out.println("Account class - withdraw");
		balance -= amount;
	}
	
	public void calcInterest() {
		System.out.println("Account class - calcInterest");
	}
	
	
}
