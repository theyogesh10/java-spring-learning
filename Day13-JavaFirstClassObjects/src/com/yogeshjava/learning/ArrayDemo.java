package com.yogeshjava.learning;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] number = new int[3]; // The object that will be created is of type - Array
		int[] thisIsAlsoValid = {1,2,3};
		System.out.println(thisIsAlsoValid[0]);
		
		SavingAccount[] account = new SavingAccount[2];
		account[0] = new SavingAccount();
		
		Account ref = new SavingAccount();
		Account[] accountsObjects = new Account[2];
		accountsObjects[0] = new SavingAccount();
		// accountsObjects[1] = new CurrentAccount();
		
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i].getActId());
		}
		
		

	}

}
