package com.yogeshjava.learning;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) {
		
		// Two ways file can be located
		// 1. Relative path : Where is the file in related to current working directory
		// 2. Absolute path : Where the file is searching from Drive letter
		
		try {
			FileInputStream fin=new FileInputStream("data.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			ObjectInputStream oin=new ObjectInputStream(bin);
			
			Account ref=(Account)oin.readObject();
			System.out.println(ref.getActId());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
