package com.yogeshjava.learning;

import java.util.Scanner;

public class MyStaticPolymorphism {

	public static void main(String[] args) {
		
		int first;
		int second;
		float dec1;
		float dec2;
		
		String firstName;
		String lastName;
		
		Scanner sc = new Scanner(System.in);
//		first = sc.nextInt();
//		second = sc.nextInt();
		
		firstName = sc.nextLine();
		lastName = sc.nextLine();
		
		MyStaticPolymorphism app = new MyStaticPolymorphism();
//		System.out.println(app.add(first, second));
		System.out.println(app.add(firstName, lastName));

	}
	
	public int add(int one, int two) {
		return one + two;
	}
	
	public String add(String one, String two) {
		return one + two;
	}

}
