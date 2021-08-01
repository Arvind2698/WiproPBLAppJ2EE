<%@page import="com.arvind.wipro.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Customer customer = (Customer) session.getAttribute("customer");
	if (customer == null) {
		response.sendRedirect("index.jsp");
	}
	%>
	<h1>Congratulations</h1>
	<h1>Your updated balance is: <%
	out.println(customer.getBalance());
	%></h1>
	
</body>
</html>