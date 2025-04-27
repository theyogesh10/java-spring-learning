package com.yogeshjava.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleDataRetrieval {
	
	public static void main(String[] args) {
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Player p1=session.load(Player.class, 1);
		// p1.setPlayerName("Laura Wolvardt");
		// session.update(p1);
		// session.delete(p1);
		System.out.println(p1.getPlayerName());
		
		transaction.commit();
		session.close();
		
	}

}
