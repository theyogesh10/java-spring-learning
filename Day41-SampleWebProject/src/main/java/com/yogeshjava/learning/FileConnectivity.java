package com.yogeshjava.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileConnectivity implements DataAccess {

	@Override
	public boolean retrieve(User obj) {
		// Incomplete code 
		FileInputStream fin=null;
		try {
			fin = new FileInputStream("user.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(fin);
		String data=sc.nextLine();
		StringTokenizer token=new StringTokenizer(data,",");
		token.countTokens();
		return false;
	}

}
