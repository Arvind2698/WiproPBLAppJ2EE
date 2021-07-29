<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<style>

	h3{
		text-align: center;
		padding: 200px 0;		
	}
	
	a{
		color: blue;
		text-decoration: none
	}
</style>
<body>
	<h3>Welcome to your profile, <%= session.getAttribute("username") %></h3>
</body>
</html>