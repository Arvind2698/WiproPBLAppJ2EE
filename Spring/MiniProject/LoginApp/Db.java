package com.arvind.wipro.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.bean.User;

public class Db {
	
	static SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	
	public static boolean addUser(User user) {
		
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(user);
			
			session.getTransaction().commit();
			
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		
	}
	
	public static User viewUser(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			User user=session.get(User.class, id);
			
			session.getTransaction().commit();
			
			return user;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
		
	}
	
	public static boolean deleteUser(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			User user=session.get(User.class,id);
			
			session.delete(user);
			
			session.getTransaction().commit();
			
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		
	}
	
	public static boolean updateUser(String id,User user) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			User user1=session.get(User.class, id);
			
			session.delete(user1);
			
			session.save(user);
			
			session.getTransaction().commit();
			
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		
	}
	
	public static List<User> getAllUser(){
		
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			List<User> list=session.createQuery("from User").list();
			session.getTransaction().commit();
		
			return list;	
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally {
			session.close();
		}
		
	}
	
}
