package com.yogeshjava.learning;

public class MainApp {
	
	public static void main(String[] args) {
		
		Printable p=new Team(); // Team can be replaced with any class implementing interface
		p.print();
		p.display();
		Displayable d=new Team();
		d.display();
	}

}
