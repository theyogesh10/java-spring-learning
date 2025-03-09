package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {
		
		Account act=new Account(1,"Yogesh",23456);
		// act.deposit(9865);

		EnableThreading obj1=new EnableThreading(act);
		EnableThreading obj2=new EnableThreading(act);
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final out is " + act.getBalance());
	}

}
