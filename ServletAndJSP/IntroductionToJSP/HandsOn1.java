package com.arvind.wipro.JSP;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandsOn1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(req.getParameter("number"));
		
		resp.getWriter().print(number);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=2;i<number;i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		
		req.setAttribute("primeList", list);
		
		req.getRequestDispatcher("HandsOn1.jsp").forward(req, resp);

	}
	
	private boolean isPrime(int number) {
		
		if(number==1) {
			return false;
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
}
