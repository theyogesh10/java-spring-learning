package com.yogeshjava.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		boolean codeIsNotCorrect=true;
		
		while(codeIsNotCorrect==true) {
			try {
				Scanner sc=new Scanner(System.in);
				int value=sc.nextInt();
				System.out.println(value);
				codeIsNotCorrect=false;
			} 
			catch (InputMismatchException ime) {
				System.out.println("Wrong data entry...!");
			}
		}			
	}
}
