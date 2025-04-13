package com.yogeshjava.sample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yogeshjava.sample.entity.User;

public class DbConnect {
	
	public boolean isValid(User ref) {
		boolean retVal = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345");
			String query = "select * from users where userid=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getUser());
			pstmt.setString(2, ref.getPass());
			ResultSet rs = pstmt.executeQuery();
			retVal = rs.next();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
	
	
	public boolean registerUser(User ref) {
		boolean retVal=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345");
			String query = "insert into users(userid,password) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getUser());
			pstmt.setString(2, ref.getPass());
			int updateRowCount=pstmt.executeUpdate();
			retVal = updateRowCount>0;
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}

}
