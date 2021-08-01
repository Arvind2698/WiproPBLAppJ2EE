package com.arvind.wipro.SpringMVC;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arvind.wipro.bean.Marks;

@Controller
public class HandsOn3 {
	
	@RequestMapping("/marksForm")
	public String showForm(Model model) {
		model.addAttribute("marks",new Marks());
		
		return "marksForm";
	}
	
	@RequestMapping("/formSubmit")
	public void showResult(@ModelAttribute("marks")Marks marks,HttpServletResponse resp) throws IOException {
		int sum=marks.getEnglish()+marks.getMaths()+marks.getScience();
		
		resp.getWriter().println(sum);
	}	
}
