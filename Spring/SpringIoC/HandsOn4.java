package com.arvind.wipro.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.Student;

public class HandsOn4 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student1=(Student)context.getBean("student1");
		Student student2=(Student)context.getBean("student2");
		
		System.out.println(student1);
		System.out.println(student2);
	}
}

