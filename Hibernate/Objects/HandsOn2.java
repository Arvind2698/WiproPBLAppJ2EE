package com.arvind.wipro.Object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.IntroToHibernate.Flower;

public class HandsOn2 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Flower.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Flower flower=session.get(Flower.class, "2");
			
			if(flower==null) {
				System.out.println("Flower not found");
			}else {
				session.delete(flower);
			}
			
			session.getTransaction().commit();
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
