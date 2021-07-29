<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="user" class="com.arvind.wipro.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	.container{
		max-width:650px;
		margin:auto;
		text-align:center
	}
	thead tr{
		background-color: yellow;
	}
	table{
		    margin: auto;
	}
</style>
<body>
	<div class="container">
		<h1>Bid Submitted</h1>
		<h3>If you win the bid you will be notified with in 24 hours</h3><br><br>
		<table>
			<thead>
				<tr>
					<td>CAR</td>
				</tr>
			</thead>
			<tbody>
				<%
					out.println("<tr>");
					out.println("<td> Item Id: "+user.getItemId()+"</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td> Item Name: "+user.getItemName()+"</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td> Name: "+user.getName()+"</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td> Email: "+user.getEmail()+"</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td> Amount: "+user.getAmount()+"</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td> Auto increment bid: "+user.getIncrement()+"</td>");
					out.println("</tr>");
				%>
			</tbody>
		</table>
	</div>
</body>
</html>