package com.yogeshjava.learning;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		Account obj;
		if(choice==1) {
			obj = new SavingsAccount(1,"Chetan",23,43,45);
		}
		else {
			if(choice==2) {
				obj = new CurrentAccount(2,"Mahesh",123,234,345);
			}
			else {
				if(choice==3) {
					obj = new SalaryAccount(3,"Suresh",43,65,54,76);					
				}
				else {
					obj = new Account(4,"Yogesh",97,57);
				}
			}	
		}
		MainApp app = new MainApp();
		app.calcAllAccountInterest(obj);
		sc.close();
		
	}
	
	public void calcAllAccountInterest(Account ref) {
		ref.calcInterest();
	}

}
