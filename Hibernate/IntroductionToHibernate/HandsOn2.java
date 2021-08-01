package com.arvind.wipro.IntroToHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HandsOn2 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Flower.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			Flower flower=new Flower("FLO1029","Rose", "pink", 100);
			
			session.beginTransaction();
			
			session.save(flower);
			
			session.getTransaction().commit();
			
			System.out.println(flower);
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}	
