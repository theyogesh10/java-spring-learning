package com.yogeshjava.learning;

import java.util.Scanner;

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
	
	public void deposit(float amount) {
		balance+=amount;
	}
	
	// MutEx - Mutually Exclusive
	// Lock
	// Semaphore - signal that a thread has locked it
	public void withdraw() {
		System.out.println("Executing Thread " + Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("Thread1")) {
			
			synchronized (this) {
				Scanner sc=new Scanner(System.in);
				balance=balance-sc.nextFloat();
			}
			
		}		
		System.out.println("Balance is " + balance + " from thread " + Thread.currentThread().getName());		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}

}
