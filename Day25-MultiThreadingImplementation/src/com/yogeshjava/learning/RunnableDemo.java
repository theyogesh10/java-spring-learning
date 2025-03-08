package com.yogeshjava.learning;

public class RunnableDemo{

	public static void main(String[] args) {
		
		Thread t1=new Thread(new UiThread());
		Thread t2=new Thread(new ConnectThread());	
		t1.setName("Thread1");
		t2.setName("Thread2");	
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RunnableDemo app=new RunnableDemo();
		app.p5To7();
				
	}
	
	public void p5To7() {
		System.out.println("Process 5 to 7");
	}
	
}
