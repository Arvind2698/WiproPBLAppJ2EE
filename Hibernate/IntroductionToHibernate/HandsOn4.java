package com.arvind.wipro.IntroToHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HandsOn4 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {

			Product p1=new Product("prod1",100);
			Product p2=new Product("prod2",200);
			Product p3=new Product("prod3",300);
			Product p4=new Product("prod4",400);
			Product p5=new Product("prod5",500);
			
			session.beginTransaction();
			
			session.save(p1);
			session.save(p2);
			session.save(p3);
			session.save(p4);
			session.save(p5);
			
			session.getTransaction().commit();
			
			System.out.println();
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
