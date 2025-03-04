package com.yogeshjava.learning;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreams {

	public static void main(String[] args) {

		// Approach 1 : Recommended
		/*
		File file = new File("output.txt");
		String data = "Hello World";
		if (file.exists()) {
			System.out.println("The file will be overwritten");
		} 
		else {
			System.out.println("New fill will be created");
		}
		try {
			FileOutputStream fout = new FileOutputStream(file);
			byte[] dataToStore = data.getBytes();
			fout.write(dataToStore);
			fout.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		// Approach 2 : Typically used
		String data="This is test taken through the stream chain";
		
		// try-with-resources
		try (
				// This is Automatic Resource Management (ARM)  
				// This is an example of Decorator design pattern 
				FileOutputStream fout = new FileOutputStream("output.txt");
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				DataOutputStream dout=new DataOutputStream(bout);
			) 
		{
			dout.writeUTF(data);
			dout.writeUTF("Some more data");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
