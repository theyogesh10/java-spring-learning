package com.yogeshjava.learning.singleton;

public class Configuration {

	public static Configuration object = new Configuration();
	
	private Configuration() {
		// TODO Auto-generated constructor stub
	}
	
	public static Configuration getInstance() {
		return object;
	}
	
}
