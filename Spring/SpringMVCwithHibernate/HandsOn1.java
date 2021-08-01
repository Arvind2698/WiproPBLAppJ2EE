package com.arvind.wipro.SpringMVCwithHibernate;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arvind.wipro.bean.Student;
import com.arvind.wipro.hibernate.Db;

@Controller
public class HandsOn1 {

	@RequestMapping("/showStudentForm")
	public String showStudentForm(Model model) {
		
		model.addAttribute("student",new Student());
		return "showStudentForm";
	}
	
	@RequestMapping("/submitSudentForm")
	public void subimtForm(@ModelAttribute("student")Student student,HttpServletResponse resp) throws IOException {
		if(Db.addStudent(student)) {
			resp.getWriter().println("ok");
		}else {
			resp.getWriter().println("not ok");
		}
	}
	
	@RequestMapping("/viewStudents")
	public String showAllStudent(Model model) {
		
		List<Student> list=Db.getAllStudents();
		
		System.out.println(list);
		
		model.addAttribute("list", list);
		
		return "viewStudents";
	}
}
