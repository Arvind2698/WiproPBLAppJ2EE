package com.arvind.wipro.GetAndPostRequest;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandsOn1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> enum1= req.getHeaderNames();
		Iterator<String> itr=enum1.asIterator();
		while (enum1.hasMoreElements()) {
			String string = (String) enum1.nextElement();
			
			resp.getWriter().println(string+" "+req.getHeader(string));
			
		}
	}
}
