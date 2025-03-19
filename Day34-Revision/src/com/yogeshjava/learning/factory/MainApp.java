package com.yogeshjava.learning.factory;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * ServiceProviderOne obj = new ServiceProviderOne(); obj.myService();
		 */
		
		ServiceInterface obj = ServiceInterfaceFactory.getObject();
		obj.service();
		
	}
	
}
