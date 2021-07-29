package com.arvind.wipro.Session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HandsOn3 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		if(session.getAttribute("visited")==null) {
			session.setAttribute("visited", true);
			session.setAttribute("visitedCount", 0);
			resp.getWriter().println("Welcome, you are visiting for the first time");
		}else {
			int count=(Integer)session.getAttribute("visitedCount");
			session.setAttribute("visitedCount", count+1);
			resp.getWriter().println("Welcome back");
			resp.getWriter().println("Visited: "+count);
		}
	}
}
