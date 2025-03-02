package com.yogeshjava.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		testMethod();
		
	}
	
	public static void testMethod() {
		
		boolean codeIsNotCorrect=true;
		while(codeIsNotCorrect==true) {
			try {
				Scanner sc=new Scanner(System.in);
				int value=sc.nextInt();
				if(value==1) { 
					return; 
				}
				System.out.println(value);
				codeIsNotCorrect=false;
			} 
			catch (InputMismatchException ime) {
				System.out.println("Wrong data entry...!");
			}
			catch (Exception e) {
				System.out.println("Generic error handler");
			}
			finally {
				System.out.println("This is after the error generic");				
				
			}
			
		}			
		
	}
}
