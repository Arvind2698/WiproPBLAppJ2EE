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
	<h1>Your current balance is</h1>
	<%
	out.println(customer.getBalance());
	%>

	<h3>Claim your cash back here</h3>

	<form action="checkCoupon" method="post">
		Enter your coupon code: <input type="text" name="coupon"> <input
			type="submit" value="Submit">
	</form>

</body>
</html>