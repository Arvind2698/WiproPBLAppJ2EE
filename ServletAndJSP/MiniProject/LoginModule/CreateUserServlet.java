package com.arvind.wipro.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arvind.wipro.bean.User;
import com.arvind.wipro.db.Db;

public class CreateUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user=new User(req.getParameter("username"), req.getParameter("password"));
		
		try {
			if(Db.addUser(user)) {
				HttpSession session=req.getSession();
				session.setAttribute("username", user.getUsername());
				resp.sendRedirect("profile.jsp");
			}else {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3 style='color:red'>User was not created</h3>");
				req.getRequestDispatcher("login.html").include(req, resp);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendRedirect("error.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendRedirect("error.html");
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendRedirect("error.html");
		}
	}
}
