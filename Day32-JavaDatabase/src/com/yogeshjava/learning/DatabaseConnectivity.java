package com.yogeshjava.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
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
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			// sc.next();
			String name = sc.next();
			
			// Statement stmt = con.createStatement();
			
			// Problem 1 : 	It is difficult to build and understand the query
			// Problem 2 : This opens the application to SQL Injection hacks
			
			/*
			 * String insertQuery = "insert into player values("+id+", '" +name +"')";
			 * System.out.println(insertQuery);
			 */
			
			String insertQuery = "insert into player values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			int updateRowCount = pstmt.executeUpdate();
			System.out.println(updateRowCount);
			
			/*
			 * int updateRowCount = stmt.executeUpdate(insertQuery);
			 * System.out.println(updateRowCount);
			 */
			
			/*
			 * ResultSet rs = stmt.executeQuery(query); ResultSetMetaData rsmd =
			 * rs.getMetaData(); System.out.println(rsmd.getColumnCount());
			 * System.out.println(rsmd.getColumnType(2)); while(rs.next()) { int id =
			 * rs.getInt(1); String name = rs.getString(2); System.out.println("The Id is "
			 * + id); System.out.println("The Name is " + name); }
			 */
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
