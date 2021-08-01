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
	<form:form action="formSubmit"  method="post"  modelAttribute="marks">
		<form:input path="maths" type="text" placeholder="Enter marks in math"/>
		<form:input path="english" type="text" placeholder="Enter marks in english"/>
		<form:input path="science" type="text" placeholder="Enter marks in science"/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>