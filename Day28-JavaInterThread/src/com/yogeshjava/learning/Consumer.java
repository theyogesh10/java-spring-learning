package com.yogeshjava.learning;

public class Consumer implements Runnable{

	public SharedData data;
	private int number;
	
	public Consumer(SharedData c, int number) {
		data=c;
		this.number=number;
	}
	
	public void run() {
		int value=0;
		for(int i=0;i<10;i++) {
			value=data.get();
			System.out.println(this.number + " got : " +value);
		}	
	}
	

}
