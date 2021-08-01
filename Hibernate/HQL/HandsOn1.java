package com.arvind.wipro.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.Annotations.Car_details;

public class HandsOn1 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			List<Car_details> list=session.createQuery("from Car_details").list();
			
			session.getTransaction().commit();

			for(Car_details c:list) {
				System.out.println(c);
			}
			
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
