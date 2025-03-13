package com.yogeshjava.learning;

import java.util.Set;
import java.util.TreeSet;

public class MainForTreeSet {

	public static void main(String[] args) {
		
		 Set<Account> accounts=new TreeSet<Account>();
		 accounts.add(new Account(43,"Mayur",87536));
		 accounts.add(new Account(23,"Mrunali",53223));
		 accounts.add(new Account(55,"Pratik",98765));
		 
		 for(Account obj : accounts) {
			 System.out.println(obj.getActId());
		 }
		
	}
	
}
