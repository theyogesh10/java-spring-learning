package com.yogeshjava.learning;

public class EnableThreading implements Runnable {

	Account ref;
	
	public EnableThreading() {
		// TODO Auto-generated constructor stub
	}
	
	public EnableThreading(Account v1) {
		ref=v1;
	}

	public Account getRef() {
		return ref;
	}

	public void setRef(Account ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		ref.withdraw();	
		ref.deposit(12345);	
	}
	
}
