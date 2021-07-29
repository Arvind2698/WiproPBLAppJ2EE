<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HandsOn2</title>
</head>
<body>
	<h3>Current date and time: </h3><% Date d=new Date(); out.println(d.getDate()+"-"+(d.getMonth()+1)+"-"+d.getYear()+" "+d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds()); %>
</body>
</html>