package com.yogeshjava.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		/*
		 * Set<String> friendSet=new HashSet<String>(); friendSet.add("Chetan");
		 * friendSet.add("Yogesh"); friendSet.add("Anand"); friendSet.add("Ashok");
		 * friendSet.add("Chetan");
		 * 
		 * System.out.println(friendSet.size());
		 * 
		 * for(String ref : friendSet) { if(ref.equals("Chetan")) { // Do what is
		 * intended } }
		 * 
		 * Iterator<String> names=friendSet.iterator(); while(names.hasNext()) { String
		 * obj=names.next(); }
		 */
		
		Set<Account> allAccounts=new HashSet<Account>();
		allAccounts.add(new Account(1,"Chetan",123));
		allAccounts.add(new Account(1,"Chetan",123));
		// Account ref=new Account(3,"Yogesh",345);
		System.out.println(allAccounts.size());
		
	}
	
}
