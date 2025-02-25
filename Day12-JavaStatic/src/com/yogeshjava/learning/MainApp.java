package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {
		
		SavingAccount.initializeStaticVars();
		
		SavingAccount s1=new SavingAccount(1,"Mujeeb",68538);
		System.out.println(s1.getIntRate());
		SavingAccount s2=new SavingAccount(2,"Suraj",57688);
		System.out.println(s1.getIntRate());
		
		System.out.println(SavingAccount.intRate);
		System.out.println(s1.intRate);

	}

}
