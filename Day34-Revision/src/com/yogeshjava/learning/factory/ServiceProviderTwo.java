package com.yogeshjava.learning.factory;

public class ServiceProviderTwo implements ServiceInterface {

	public void yourService() {
		System.out.println("Whatever you say");
	}
	
	public void service() {
		System.out.println("Standard method cell, specific execution from provider Two");
	}
	
}
