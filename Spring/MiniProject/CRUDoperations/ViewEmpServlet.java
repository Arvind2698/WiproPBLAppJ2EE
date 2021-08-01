package com.arvind.wipro.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arvind.wipro.bean.Employee;
import com.arvind.wipro.hibernate.Db;

public class ViewEmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Employee> list=Db.getAllEmployees();
		
		req.setAttribute("emp", list);
		
		req.getRequestDispatcher("showEmp.jsp").forward(req, resp);
		
	}
}
