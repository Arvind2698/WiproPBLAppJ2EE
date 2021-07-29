package com.arvind.wipro.Session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandsOn2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookies[]=req.getCookies();
		
		if(cookies==null) {
			resp.getWriter().println("No cookies available");
		}else {
			
			for(Cookie c:cookies) {
				resp.getWriter().println(c.getName()+": "+c.getValue());
			}
			
		}
		
	}
}
