package com.yogeshjava.learning.factory;

public class ServiceProviderOne implements ServiceInterface {

	public void myService() {
		System.out.println("My way or highway");
	}

	public void service() {
		System.out.println("Standard method cell, specific execution from provider One");
	}
	
}
