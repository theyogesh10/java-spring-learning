package com.yogeshjava.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Account ref=new Account(2,"Yogesh",23456);
		
		Configuration cfg=new Configuration();
		cfg.configure("config.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		ses.save(ref);
		
		tr.commit();
		ses.close();
					
	}

}
