package com.arvind.wipro.HQL;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.Annotations.Car_details;

public class HandsOn3 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			Scanner scanner=new Scanner(System.in);
			
			String regno=scanner.next();
			
			session.beginTransaction();
			
			Car_details car=session.get(Car_details.class,regno);
			
			if(car==null) {
				System.out.println("car not found");
			}else {
				System.out.println(car);
			}
			
			session.getTransaction().commit();
			
			
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
