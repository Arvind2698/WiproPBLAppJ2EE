package com.arvind.wipro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arvind.wipro.bean.Employee;
import com.arvind.wipro.hibernate.Db;

public class SaveEditedEmpServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee employee=new Employee(req.getParameter("id"), req.getParameter("name"), req.getParameter("gender"), req.getParameter("designation"), Integer.parseInt(req.getParameter("salary")),req.getParameter("city"), req.getParameter("email"), req.getParameter("phone"));
		
		if(Db.updateEmp(employee.getId(), employee)) {
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:blue'>Employee added successfully <a href='index.html'>Click here to go back to the home page</a></h3>");
			req.getRequestDispatcher("addEmp.html").include(req, resp);
		}else {
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:red'>Employee was NOT added...<a href='index.html'>Click here to go back to the home page</a></h3>");
			req.getRequestDispatcher("addEmp.html").include(req, resp);
		}
	}
}
