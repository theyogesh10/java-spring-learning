package com.yogeshjava.learning;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		List<Player> players=new ArrayList<Player>();
		Team india=new Team(1,"India",players);
		players.add(new Player(1,"Harmanpreet Kaur", india));
		players.add(new Player(2,"Smriti Mandhana",india));
		players.add(new Player(3,"Sneh Rana",india));
		
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ses.beginTransaction();
		
		ses.save(india);
		tr.commit();
		ses.close();
		
	}

}
