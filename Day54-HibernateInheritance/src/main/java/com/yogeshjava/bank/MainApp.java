package com.yogeshjava.bank;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Account a1=new Account(1,"Rahul",3431);
		SavingsAccount s1=new SavingsAccount(2,"Anand",6856,500);
		Account a2=new SavingsAccount(3,"Ashok",7586,1000);
		
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ses.beginTransaction();
		
		ses.save(a1);
		ses.save(s1);
		ses.save(a2);
		
		tr.commit();
		ses.close();
		
	}
	
}
