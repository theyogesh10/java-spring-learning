<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Connection, java.sql.DriverManager,java.sql.SQLException"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>This is JSP</p>
	<p>You are a valid user <%=session.getAttribute("userdata") %></p>
	<p>This is the main menu</p>
	<p><a href="option1">Option1</a></p>
	
	
	<%! // Declaration tag
		String user=null;
		String pass="ABC";
		
		public void m1(){
			System.out.println("JSP Method");
		}
	%>
	<p>This is JSP</p>
	<!-- // out.println("This is JSP"); -->
	<p>You are a valid user <%=session.getAttribute("userdata") %></p>
	<!-- // out.println("You are a valid user") -->
	<%	// Scriptlet
		String url="jdbc:mysql://localhost:3306/test";
		try{
			m1();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
            e.printStackTrace();
        }	
	%>
	<%= "This is an expression tag" %>
	<%= 5+5 %>
	<p>This is the main menu</p> 
	<!-- // out.println("This is the main menu"); -->
	<p><a href="option1">Option1</a></p>
	
	
</body>
</html>