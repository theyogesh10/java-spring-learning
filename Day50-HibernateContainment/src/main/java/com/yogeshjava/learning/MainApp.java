package com.yogeshjava.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Employee ref=new Employee(1,"Yogesh", 23445, new Address("Hyderabad","TS"));
		
		Configuration cfg=new Configuration();
		cfg.configure(); 	// if the name of the file is hibernate.cfg.xml 
							// we do not have to provide the value to configure() method 
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		
		// new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tr=ses.beginTransaction();
		
		ses.save(ref);
		tr.commit();
		ses.close();
		
	}

}
