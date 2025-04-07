<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</body>
</html>