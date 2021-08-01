package com.arvind.wipro.Object;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.IntroToHibernate.Emp;
import com.arvind.wipro.IntroToHibernate.Flower;

public class HandsOn1 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Flower.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Flower flower=session.get(Flower.class, "2");
			
			session.getTransaction().commit();
			
			System.out.println(flower);
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
