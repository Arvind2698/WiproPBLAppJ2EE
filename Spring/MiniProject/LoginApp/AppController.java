package com.arvind.wipro.LoginApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arvind.wipro.bean.User;
import com.arvind.wipro.hibernate.Db;

@Controller
public class AppController {
	
	@RequestMapping("/register")
	public String showRestistration(Model model) {
		model.addAttribute("user",new User());
		
		return "registrationForm";
	}
	
	@RequestMapping("/registerUser")
	public void registerUser(@ModelAttribute("user")User user,HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException {
		
		if(Db.addUser(user)) {
			
			resp.setContentType("text/html");
			resp.getWriter().println("<h3>User added</h3><a href='index.jsp'>Click to go home</a>");
			req.getRequestDispatcher("registrationForm.jsp").include(req, resp);
			
		}else {
			resp.getWriter().println("<h3>User not added</h3><a href='index.jsp'>Click to go home</a>");
			req.getRequestDispatcher("registrationForm.jsp").include(req, resp);
		}
	}
	
	@RequestMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("loginuser", new User());
		
		return "loginPage";
	}
	
	@RequestMapping("/checkUser")
	public String showUserProfile(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		User user2=Db.viewUser(req.getParameter("username"));

		if(user2.getPassword().equals(req.getParameter("password"))) {
			req.getSession().setAttribute("login", user2);
			return "userProfile";
		}
		
		resp.getWriter().println("<h3>User could be loged in!!</h3><a href='index.jsp'>Click to go home</a>");
		req.getRequestDispatcher("registrationForm.jsp").include(req, resp);
		
		return "loginPage";
				
	}
}
