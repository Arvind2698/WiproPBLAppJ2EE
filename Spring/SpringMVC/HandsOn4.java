package com.arvind.wipro.SpringMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HandsOn4 {
	@RequestMapping("movies")
	public String showMovies(Model model) {
		List<String> movies=new ArrayList<String>();
		
		movies.add("movie A");
		movies.add("movie b");
		movies.add("movie c");
		movies.add("movie d");
		movies.add("movie e");
		movies.add("movie f");
		movies.add("movie g");
		movies.add("movie h");
		movies.add("movie i");
		movies.add("movie j");
		movies.add("movie k");
		
		model.addAttribute("movies", movies);
		
		return "movies";
	}
}
