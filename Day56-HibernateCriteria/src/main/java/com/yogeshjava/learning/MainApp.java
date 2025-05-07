package com.yogeshjava.learning;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainApp {
	public static void main(String[] args) {
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction=session.beginTransaction();
		
		// Section 1 : JPA Specific Code
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Object[]> query=builder.createQuery(Object[].class);
		
		Root<Player> base=query.from(Player.class);
		
		// 1. select  * from player
		// query.select(base);
		
		// 2. select * from player where playerid<3
		// query.select(base).where(builder.lt((Expression)base.get("playerId"),3));  // lt, gt,eq for compare data
		
		// 3 select playerName, playerId from player
		query.multiselect(base.get("playerName"), base.get("playerId"));
		
		// Section 2 : Hibernate specific code
		Query<Object[]> que1=session.createQuery(query);
		List<Object[]> result=que1.getResultList();	// This is where the query executes
		
		/*
		 * for(Player p : result) { System.out.println(p.getPlayerName()); }
		 */
		
		System.out.println(result.size());
		for(Object[] data : result) {
			System.out.println(data[0]);
		}
		
 	}

}
