package com.arvind.wipro.HQL;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.Annotations.Car_details;

public class HandsOn2 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			List list=session.createQuery("from Car_details").list();
			
			session.getTransaction().commit();
			
			Iterator itr=list.iterator();
			
			while(itr.hasNext()) {
				Car_details c=(Car_details)itr.next();
				System.out.println(c.getModel()+" "+c.getManufacturer());
			}
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
