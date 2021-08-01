package com.arvind.wipro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arvind.wipro.hibernate.Db;

public class DeleteEmpServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		
		if(Db.deleteEmp(id)) {
			resp.sendRedirect("viewEmp");
			
		}else {
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:red'>Employee was NOT deleted...<a href='index.html'>Click here to go back to the home page</a></h3>");
			req.getRequestDispatcher("viewEmp").include(req, resp);
		}
	}
}
