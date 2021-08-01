package com.arvind.wipro.IntroToHibernate;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HandsOn1 {
	public static void main(String[] arg) {
		
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Emp.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			Emp emp=new Emp("arvind", "ramachandrn", "rac@gmail.com", "98987876", new Date(2021,6 ,24), "AD_VP", 9900,0.9 , 100, 90);
			
			session.beginTransaction();
			
			session.save(emp);
			
			session.getTransaction().commit();
			
		}finally {
			session.close();
			sessionFactory.close();
		}
		
	}
}
