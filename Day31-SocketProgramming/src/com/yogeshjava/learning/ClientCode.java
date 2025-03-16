package com.yogeshjava.learning;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {

	public static void main(String[] args) {
		
		try {
			Socket sender = new Socket("localhost",20000);
			String message = "Client says Hello";
			
			DataOutputStream senderStream = new DataOutputStream(sender.getOutputStream());
			senderStream.writeUTF(message);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
