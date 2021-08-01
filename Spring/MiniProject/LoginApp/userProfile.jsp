<%@page import="com.arvind.wipro.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if(session.getAttribute("login")==null){
		response.sendRedirect("index.jsp");
	}else{
		User user=(User)session.getAttribute("login");
		out.println(user.getUsername());
	}
	
		%>
	
</body>
</html>