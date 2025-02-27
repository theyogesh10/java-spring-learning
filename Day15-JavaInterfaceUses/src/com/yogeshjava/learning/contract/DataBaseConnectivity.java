package com.yogeshjava.learning.contract;

public class DataBaseConnectivity implements DataConnectivity{
	
	public void connectToDataBase() {
		System.out.println("This will help to connect with DB");
	}

	@Override
	public void connect() {
		System.out.println("Connect with DataBase");
		
	}
	
}
