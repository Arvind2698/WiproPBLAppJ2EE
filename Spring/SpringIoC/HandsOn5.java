package com.arvind.wipro.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvind.wipro.bean.Player;
import com.arvind.wipro.bean.Student;

public class HandsOn5 {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Player p1=(Player)context.getBean("player1");
		Player p2=(Player)context.getBean("player2");
		Player p3=(Player)context.getBean("player3");
		Player p4=(Player)context.getBean("player4");
		Player p5=(Player)context.getBean("player5");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
}
