package com.yogeshjava.learning;

import com.mayur.code.ClassCreatedByMayur;

public class MainApp {

	public static void main(String[] args) {
		LegalCode ref = new ClassCreatedByMayur();
		ref.m1();
		SuperClass obj = (SuperClass)ref;		// error - ClassCastException
		obj.confidentialMethod();		
		
	}
}
