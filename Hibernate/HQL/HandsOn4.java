package com.arvind.wipro.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.Annotations.Car_details;

public class HandsOn4 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			List<String> list=session.createQuery("from Car_details c where c.manufacturer like 'V%'").list();
			
			session.getTransaction().commit();
			
			System.out.println(list);
			
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
