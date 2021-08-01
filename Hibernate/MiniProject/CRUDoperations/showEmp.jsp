<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.arvind.wipro.bean.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<style>
	div{
		max-width: 800px;
		margin:50px auto;
		text-align: center;
	}
	h1{
		margin-bottom:30px;
	}
</style>
<body>
	<div>
		<h1>Employees Details Table</h1>
	
		<table class="table table-striped table-hover">
		
			<thead>
				<tr>
					<td>Name</td>
					<td>ID</td>
					<td>Gender</td>
					<td>Designation</td>
					<td>Salary</td>
					<td>City</td>
					<td>Email</td>
					<td>Mobile</td>
					<td>Options</td>
				</tr>
			</thead>

			<tbody>		
				
				<% 
				List<Employee> list=(List<Employee>)request.getAttribute("emp");
				
				for(int i=0;i<list.size();i++){
					
					Employee e=list.get(i);
					
					out.println("<tr>");
					out.println("<td>"+e.getName()+"</td>");
					out.println("<td>"+e.getId()+"</td>");
					out.println("<td>"+e.getGender()+"</td>");
					out.println("<td>"+e.getDesignation()+"</td>");
					out.println("<td>"+e.getSalary()+"</td>");
					out.println("<td>"+e.getCity()+"</td>");
					out.println("<td>"+e.getEmail()+"</td>");
					out.println("<td>"+e.getMobile()+"</td>");
					out.println("<td><a href='editEmp?id="+e.getId()+"'>Edit</a> <a href='deleteEmp?id="+e.getId()+"'>Delete</a></td>");
					out.println("</tr>");
					
				}
				
				
				%>
				
			</tbody>
		
		</table>
	</div>
</body>
</html>