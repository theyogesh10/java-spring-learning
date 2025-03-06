package com.yogeshjava.learning;

public class OnlineStudent implements Payable{

	@Override
	public void payFees() {
		
		System.out.println("Online Student fee payment");
		
	}
	
	@Override
	public void payOnlineFees() {
		System.out.println("Pay online fees");
	}

}
