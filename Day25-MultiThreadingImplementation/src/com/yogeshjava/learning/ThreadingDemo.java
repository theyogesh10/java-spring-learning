package com.yogeshjava.learning;

public class ThreadingDemo extends Thread {

	public static void main(String[] args) {
		
		Thread t1=new ThreadingDemo();
		Thread t2=new ThreadingDemo();
		
		t1.setName("Thread1");
		t2.setName("Thread2");	
		
		t1.start();
		t2.start();

	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Thread1")) {
			p1();
			p4();
		}
		else {
			p2();
			p3();
		}
	}
	
	
	public void p1() {
		System.out.println("P1");
	}
	public void p2() {
		System.out.println("P2");
	}
	public void p3() {
		System.out.println("P3");
	}
	public void p4() {
		System.out.println("P4");
	}
	
}
