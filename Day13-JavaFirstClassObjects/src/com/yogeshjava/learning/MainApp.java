package com.yogeshjava.learning;

public class MainApp {
	public static void main(String[] args) {
		
		// String Behavior
		
		// String s1="Hello";
		// String s2="Hello";
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		/*
		 * if(s1==s2) { System.out.println("Same"); } else {
		 * System.out.println("Different"); }
		 */
		
		// When comparing TWO string, please ENSURE to use equals method ALWAYS
		
		if(s1.equals(s2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		
	}
	
	
	
	
	
	

}
