package com.yogeshjava.learning;

public class Producer implements Runnable {

	private SharedData data;
	private int number;
	
	public Producer(SharedData c, int number) {
		data=c;
		this.number=number;
	}

	public void run() {
		for(int i=0;i<10;i++) {
			data.put(i);
			System.out.println(this.number + " put : " +i);
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}
