package com.yogeshjava.learning.contract;

public class MainApp {
	public static void main(String[] args) {
		
		/*
		 * // if storage is in db DataBaseConnectivity dbConnect = new
		 * DataBaseConnectivity(); dbConnect.connectToDatabase();
		 * 
		 * // if storage is in file FileConnectivity fileConnect = new
		 * FileConnectivity(); fileConnect.connectToFile();
		 */
		
		DataConnectivity ref = DataConnectivityFactory.getObject();
		ref.connect();
		
	}

}
