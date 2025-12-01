package com.yogeshjava.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Player ref = (Player)ctx.getBean("getPlayer");
		System.out.println(ref.dob.getDay());
		
//		ref.modifyDetails();

	}

}
