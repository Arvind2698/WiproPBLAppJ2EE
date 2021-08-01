<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" action="registerUser" method="post">
		<form:input path="username" type="text"/><br>
		<form:input path="password" type="text"/><br>
		<form:input path="empid" type="text"/><br>
		<form:input path="email" type="text"/><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>