package com.yogeshjava.learning.project2;

import com.yogeshjava.learning.Account;
import com.yogeshjava.learning.LowBalanceException;

public class MainApp {

	public static void main(String[] args) {
		
		Account ref=new Account();
		try {
			ref.withdraw(735);
		} catch (LowBalanceException e) {
			//Send the mail
			System.out.println("Write Java mail code here");
		}
		
	}
}
