package com.yogeshjava.learning;

public class SuperClass implements LegalCode {
	
	public SuperClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void m1(){
		System.out.println("Typical business logic method");
	}
	
	public void confidentialMethod() {
		System.out.println("The method that is available only through heirarchy");
	}
	

}
