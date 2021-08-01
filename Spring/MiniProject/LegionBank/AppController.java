package com.arvind.wipro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arvind.wipro.Db.Db;
import com.arvind.wipro.bean.Coupon;
import com.arvind.wipro.bean.Customer;

@Controller
public class AppController {

	@RequestMapping("/login")
	public void loginCustomer(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		Customer customer=Db.getCustomer(name);
		
		if(customer==null) {
			
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:red'>Invalid details</h3>");
			req.getRequestDispatcher("index.jsp").include(req, resp);
			
		}else {
			if(customer.getPassword().equals(password)) {
				
				req.getSession().setAttribute("customer", customer);
				
				resp.sendRedirect("customerProfile.jsp");
								
				
			}else {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3 style='color:red'>Invalid details</h3>");
				req.getRequestDispatcher("index.jsp").include(req, resp);
			}
		}
	}
	
	@RequestMapping("/checkCoupon")
	public void checkCoupon(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		String code=req.getParameter("coupon");
		
		Coupon coupon=Db.checkCoupon(code);
		
		System.out.println(code);
		
		if(coupon==null) {
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:red'>Invalid code</h3>");
			req.getRequestDispatcher("customerProfile.jsp").include(req, resp);
		}else {
			double value=coupon.getValue();
			Customer customer=(Customer)req.getSession().getAttribute("customer");
			double b=customer.getBalance();
			
			b+=b * (value/100);
			
			customer.setBalance(b);
						
			req.getSession().setAttribute("customer", customer);
			
			if(Db.updateCustomer(customer)) {
				
				resp.sendRedirect("finalPage.jsp");
				
			}else {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3 style='color:red'>Invalid code</h3>");
				req.getRequestDispatcher("customerProfile.jsp").include(req, resp);
			}
		
			
		}
	
	}
}
