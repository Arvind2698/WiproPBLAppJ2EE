package com.arvind.wipro.SpringBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.Movie;

public class HandsOn1 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Movie movie=context.getBean(Movie.class, "movie");
		
		System.out.println(movie);
	}
}
