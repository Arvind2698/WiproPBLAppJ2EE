package com.arvind.wipro.Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HandsOn1and2 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Car_details car1=new Car_details("KL-07", "AB 123 Polo", "white", "VW");
			Car_details car2=new Car_details("KL-08", "AB 234 Vento", "black", "VW");
			Car_details car3=new Car_details("KL-09", "AB 345 Collrola", "silver", "Toyota");
			
			session.save(car1);
			session.save(car2);
			session.save(car3);
			
			session.getTransaction().commit();
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
