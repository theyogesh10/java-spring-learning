package com.yogeshjava.learning;

public interface Payable {
	
	// By Default a variable declared in an interface is public, static and final
	// float fees=12345;
	
	public void payFees();
	
	public default void payOnlineFees() {
		System.out.println("Payable online fees : through interface");
	}	

}
