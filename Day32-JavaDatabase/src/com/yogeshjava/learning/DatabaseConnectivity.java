package com.yogeshjava.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnectivity {
	
	public static void main(String[] args) {
		try {
			
			// for Oracle : oracle.jdbc.Driver
			// for MySql < 8.0 : com.mysql.jdbc.Driver 
			// for MySQl > 8.0 : com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection string
			// protocol:subprotocol:db-specific information
			// jdbc:<dbname>:db-specific information
			// for oracle :- jdbc:oracle:thin:@localhost:1521:dbname
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345");
			String query = "select * from player";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println("The Id is" + id);
			System.out.println("The Name is" + name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
