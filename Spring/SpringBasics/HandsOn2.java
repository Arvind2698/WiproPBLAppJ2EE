package com.arvind.wipro.SpringBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.DefaultMessage;

public class HandsOn2 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DefaultMessage defaultMessage=context.getBean(DefaultMessage.class,"defaultmessage");
		System.out.println(defaultMessage);
	}
}
