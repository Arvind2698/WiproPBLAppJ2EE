<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	ArrayList<Integer> list=(ArrayList)request.getAttribute("primeList");
	for(int i:list){
		out.println(i);
	}
	%>
</body>
</html>