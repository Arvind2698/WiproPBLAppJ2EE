package com.arvind.wipro.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.DefaultMessage;

public class HandsOn3 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DefaultMessage message=context.getBean(DefaultMessage.class,"defaultmessage");
		
		System.out.println(message);
	}
}
