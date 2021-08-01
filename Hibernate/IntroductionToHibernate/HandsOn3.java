package com.arvind.wipro.IntroToHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HandsOn3 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		try {
					
			Employee emp1=new Employee("emp1", "developer", 1000);
			Employee emp2=new Employee("emp2", "developer", 2000);
			Employee emp3=new Employee("emp3", "developer", 3000);
			Employee emp4=new Employee("emp4", "developer", 4000);
			Employee emp5=new Employee("emp5", "developer", 5000);

			session.beginTransaction();

			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.save(emp4);
			session.save(emp5);

			session.getTransaction().commit();

			
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}

