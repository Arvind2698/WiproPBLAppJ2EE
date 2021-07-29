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
		int num=Integer.parseInt(request.getParameter("num"));
	
		if(num<10){
			request.getRequestDispatcher("HandsOn2a.jsp").forward(request, response);
		}else if(num>10 && num<99){
			request.getRequestDispatcher("HandsOn2b.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	%>
</body>
</html>