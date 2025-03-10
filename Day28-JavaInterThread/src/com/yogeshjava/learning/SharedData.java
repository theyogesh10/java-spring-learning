package com.yogeshjava.learning;

public class SharedData extends Object {
	private int contents;
	private boolean available=false;
	
	public synchronized int get() {
		while(available==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value) {
		while (available==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		contents=value;
		available=true;
		notify();
	}

}
