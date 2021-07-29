package com.arvind.wipro.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arvind.wipro.bean.User;
import com.arvind.wipro.db.Db;

public class ChangePasswordServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user=new User(req.getParameter("username"), req.getParameter("password"));
		
		try {
			if(Db.checkUser(user)) {
				user.setPassword(req.getParameter("newpassword"));
				
				if(Db.changePassword(user)) {
					resp.setContentType("text/html");
					resp.getWriter().println("<h3 style='color:red'>Password updated successfully</h3>");
					req.getRequestDispatcher("changePassword.html").include(req, resp);
				}else {
					
					resp.setContentType("text/html");
					resp.getWriter().println("<h3 style='color:red'>Password was not changed</h3>");
					req.getRequestDispatcher("changePassword.html").include(req, resp);
				}
				
		
			}else {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3 style='color:red'>Password was not changed</h3>");
				req.getRequestDispatcher("changePassword.html").include(req, resp);
			}
		} catch (ClassNotFoundException | SQLException | IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendRedirect("error.html");
		}
	}
}
