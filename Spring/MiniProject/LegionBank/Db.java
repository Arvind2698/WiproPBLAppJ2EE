package com.arvind.wipro.Db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.bean.Coupon;
import com.arvind.wipro.bean.Customer;

public class Db {
	private static SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Coupon.class).addAnnotatedClass(Customer.class).buildSessionFactory();
	
	public static Customer getCustomer(String name) {
		
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Customer customer= session.get(Customer.class, name);
			
			session.getTransaction().commit();
			
			return customer;
			
		}finally {
			session.close();
		}
		
	}
	
	public static Coupon checkCoupon(String code) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Coupon coupon= session.get(Coupon.class, code);
			
			session.getTransaction().commit();
			
			return coupon;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
	}
	
	public static boolean updateCustomer(Customer customer) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Customer customer1= session.get(Customer.class, customer.getName());
			
			customer1.setBalance(customer.getBalance());
			
			session.getTransaction().commit();
			
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}finally {
			session.close();
		}	

	}
	
}
