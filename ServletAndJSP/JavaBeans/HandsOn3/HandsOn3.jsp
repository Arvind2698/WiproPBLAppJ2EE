<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="employee" class="com.arvind.wipro.Emp" scope="session" />
<jsp:setProperty name="employee" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%request.getRequestDispatcher("handson3").forward(request, response); %>
</body>
</html>