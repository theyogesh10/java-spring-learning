package com.yogeshjava.learning;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStorage {

	public static void main(String[] args) {

		Account ref = new Account(1, "Yogesh", 4232, 0.04f);

		try {
			FileOutputStream fout = new FileOutputStream("data.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oout = new ObjectOutputStream(bout);
			
			/*
			 * DataOutputStream dout=new DataOutputStream(bout); dout.write(ref.getActId());
			 * dout.writeUTF(ref.getActName()); dout.writeFloat(ref.getBalance());
			 * dout.writeFloat(ref.getInterestRate()); dout.close();
			 */
			 			
			oout.writeObject(ref);
			
			oout.close();
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
