package com.arvind.wipro.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.Shape;
import com.arvind.wipro.bean.Triangle;

public class HandsOn1 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape shape=(Shape)context.getBean("rectangle");
		
		shape.drawShape();
	}
}
