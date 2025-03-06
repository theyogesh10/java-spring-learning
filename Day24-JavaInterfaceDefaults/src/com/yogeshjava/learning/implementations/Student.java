package com.yogeshjava.learning.implementations;

import com.yogeshjava.learning.Payable;

public class Student implements Payable {

	@Override
	public void payFees() {
		System.out.println("Normal fee payment");
		
	}

}
