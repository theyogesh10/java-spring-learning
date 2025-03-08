package com.yogeshjava.learning;

public class UiThread implements Runnable {

	@Override
	public void run() {
		p1();
		p4();		
	}
	
	public void p1() {
		System.out.println("P1");
	}
	
	public void p4() {
		System.out.println("P4");
	}

}
