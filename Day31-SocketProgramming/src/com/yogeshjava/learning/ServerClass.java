package com.yogeshjava.learning;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	
	public static void main(String[] args) {
		
		// The value for socket number ranges from 0 to 65535
		// 0 to 1023 are reserved for specific uses by predefined services
		
		try {
			ServerSocket server = new ServerSocket(20000);
			Socket receiveSocket = server.accept();
			DataInputStream din = new DataInputStream(receiveSocket.getInputStream());
			String msg = din.readUTF();
			System.out.println(msg + " Received from client");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
