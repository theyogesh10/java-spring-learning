package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {

		// SavingsAccount sa = new SavingsAccount(1,"Yogesh",23,234,34);
		// System.out.println(sa.getAccNo());
		// sa.withdraw(12);
		// System.out.println(sa.getBalance());
		
		Account a = new Account(1,"Yogesh",23,32);
		SavingsAccount  sa = new SavingsAccount(2,"Satish",43,432,32);
		CurrentAccount cr = new CurrentAccount(3,"Anand",643,76481,26);
		
		// a.withdraw(23);
		
		// Superclass ref -> sub class obj is OK
		// Sub class ref -> super class obj is NOT OK
		
		Account ref = new SavingsAccount(4,"Mahesh",53,3215,53); 
		// SavingsAccount ref2 = new Account(4,"Rahesh",5,32); // not allowed
		

	}

}
