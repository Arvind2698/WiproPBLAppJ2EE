package com.arvind.wipro.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.arvind.wipro.Annotations.Car_details;

public class HandsOn5 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car_details.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Criteria criteria=session.createCriteria(Car_details.class);
			criteria.add(Restrictions.eq("color", "black"));
			
			List list=criteria.list();
			
			System.out.println(list);
			
			
			session.getTransaction().commit();
			
			
			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}
