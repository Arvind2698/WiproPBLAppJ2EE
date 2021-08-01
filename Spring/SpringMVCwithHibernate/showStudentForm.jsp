<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="submitSudentForm" modelAttribute="student" method="post">
		<form:input path="regno" type="text"/><br>
		<form:input path="name" type="text"/><br>
		<form:input path="email" type="text"/><br>
		<input type="submit" value="submit" />
	</form:form>

</body>
</html>