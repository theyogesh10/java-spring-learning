package com.yogeshjava.learning;

public class ConnectThread implements Runnable {

	@Override
	public void run() {
		p2();
		p3();		
	}
	
	public void p2() {
		System.out.println("P2");
	}
	
	public void p3() {
		System.out.println("P3");
	}

}
