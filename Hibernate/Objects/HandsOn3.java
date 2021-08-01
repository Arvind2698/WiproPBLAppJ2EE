package com.arvind.wipro.Object;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.IntroToHibernate.Flower;

public class HandsOn3 {
	public static void main(String[] arg) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Flower.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		try {

			Scanner s = new Scanner(System.in);
			String id = s.next();
			double price = s.nextDouble();

			session.beginTransaction();

			Flower flower = session.get(Flower.class, id);

			flower.setPrice(price);

			session.getTransaction().commit();

			System.out.println(flower);

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
