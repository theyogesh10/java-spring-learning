package com.yogeshjava.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Employee obj=new Employee(1,"Naveen",1000);
		
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(obj);
		tr.commit();
		ses.close();
		
		
	}

}
