package com.yogeshjava.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements DataAccess {

	@Override
	public boolean retrieve(User obj) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345");
			String query="select * from users where userid=? and password=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, obj.getUserId());
			pstmt.setString(2, obj.getPassword());
			ResultSet rs=pstmt.executeQuery();
			return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	

}
