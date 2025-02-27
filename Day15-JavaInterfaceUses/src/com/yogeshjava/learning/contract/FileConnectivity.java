package com.yogeshjava.learning.contract;

public class FileConnectivity implements DataConnectivity {
	
	public void connectToFile() {
		System.out.println("This will connect with a flat file");
	}

	@Override
	public void connect() {
		System.out.println("Connect with file");
		
	}

}
