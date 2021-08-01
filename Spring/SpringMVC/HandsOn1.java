package com.arvind.wipro.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandsOn1 {

	@RequestMapping("/hello")
	public String helloWorldPage() {
		return "helloWorld";
	}
	
}
