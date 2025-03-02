package com.yogeshjava.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainApp {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Account obj=new Account(1,"Gautam",123,0.6f);
		try {
			obj.withdraw(543);
		} catch (LowBalanceException e) {
			System.out.println("Insuffcient Balance...!");
		}
		System.out.println(obj.getBalance());
		
	}

}
