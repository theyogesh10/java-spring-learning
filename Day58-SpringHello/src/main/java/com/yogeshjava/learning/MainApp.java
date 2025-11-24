package com.yogeshjava.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Player ref = (Player)ctx.getBean("player");
		System.out.println(ref.getDob().getYear());
		
//		System.out.println(ref.getPlayerName());
//		
//		Player anotherref = (Player)ctx.getBean("player");
//		
//		if(ref==anotherref) {
//			System.out.println("Same");
//		}
//		else {
//			System.out.println("Different");
//		}
		
	}

}
