package com.arvind.wipro.SpringMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandsOn2 {
	
	@RequestMapping("movies")
	public String showMovies(Model model) {
		List<String> movies=new ArrayList<String>();
		
		movies.add("movie A");
		movies.add("movie b");
		movies.add("movie c");
		movies.add("movie d");
		movies.add("movie e");
		
		model.addAttribute("movies", movies);
		
		return "movies";
	}
}
