package com.yogeshjava.learning;

import java.util.ArrayList;
import java.util.List;

public class MainForArrayList {

	public static void main(String[] args) {
		
		// The Collection should have a restriction/constraint/generic type defined with the help of <>
		
		List<Account> names=new ArrayList<Account>();
		System.out.println(names.size());
		// names.add(12);
		// names.add("Yogesh");
		names.add(new Account());
		System.out.println(names.size());
		names.add(new Account(1556,"Yogesh",1234));
		
		for(int ctr=0;ctr<names.size();ctr++) {
			Account ref=names.get(ctr);
			ref.getBalance();
			
			
			/*
			 * Object ref=names.get(ctr); if(ref instanceof Account) {
			 * System.out.println("The element is " + ctr); Account obj=(Account)ref;
			 * obj.getBalance(); }
			 */
			
		}
				
	}
	
}
