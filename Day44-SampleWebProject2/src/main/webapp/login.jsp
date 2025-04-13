<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<form action="validate" method="post">
		<label for="userName"> Username :</label>
		<input type=text name="userName"/>
		<label for="password"> Password :</label>
		<input type="password" name="password"/>
		<input type="submit"/>
	</form>
	
	<p> Attempt : <%=session.getAttribute("attempt") %></p>
	<p style="color:red"><%=session.getAttribute("loginError") %></p>
	
</body>
</html>