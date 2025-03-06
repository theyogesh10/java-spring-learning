package com.yogeshjava.learning;

import com.yogeshjava.learning.implementations.Student;

public class MainApp {

	public static void main(String[] args) {
		
		// Payable p=new Student();
		// System.out.println(p.fees);	
		// Payable p1=new OnlineStudent();
		// System.out.println(p1.fees);
		
		
		Payable[] pay= {new Student(), new OnlineStudent()};
		
		/*
		 * for(int ctr=0;ctr<pay.length;ctr++) { Payable ref=pay[ctr]; ref.payFees(); }
		 */
		
		//for..each loop
		for(Payable ref:pay) {
			ref.payOnlineFees();
		}
		
	}
	
}
