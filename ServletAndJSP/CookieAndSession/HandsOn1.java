package com.arvind.wipro.Session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class HandsOn1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		if(session.getAttribute("visited")==null) {
			session.setAttribute("visited", true);
			resp.getWriter().println("Welcome, you are visiting for the first time");
		}else {
			resp.getWriter().println("Welcome back");
		}
	}
}
