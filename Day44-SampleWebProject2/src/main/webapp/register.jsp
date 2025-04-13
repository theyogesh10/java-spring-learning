<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<label for="userName"> Username :</label>
		<input type=text name="userName"/>
		<label for="password"> Password :</label>
		<input type="password" name="password"/>
		<input type="submit"/>
		<p><%=session.getAttribute("registerError") %>
		
	</form>
</body>
</html>