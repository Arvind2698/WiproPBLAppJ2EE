<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%! public int fact(int num){ 
		 if(num==1){
			 return 1;
		 }
		 return num*fact(num-1);
 	}
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HandsOn3</title>
</head>
<body>
	<table>
		<tr>
			<td>Number</td>
			<td>Factorial</td>
		</tr>
		<% 
			for(int i=1;i<10;i++){
				out.println("<tr>");
				out.println("<td>");out.println(i);out.println("</td>");
				out.println("<td>");out.println(fact(i));out.println("</td>");
				out.println("</tr>");
			}
		%>
	</table>
</body>
</html>