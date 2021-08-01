package com.arvind.wipro.hibernate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.bean.Student;

public class Db {
	
	static SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	
	public static boolean addStudent(Student stu) {
		
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(stu);
			
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
	
	public static Student viewStudent(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student emp=session.get(Student.class, id);
			
			session.getTransaction().commit();
			
			return emp;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
		
	}
	
	public static boolean deleteStudent(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student student=session.get(Student.class,id);
			
			session.delete(student);
			
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
	
	public static boolean updateStudent(String id,Student emp) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student student=session.get(Student.class, id);
			
			session.delete(student);
			
			session.save(student);
			
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
	
	public static List<Student> getAllStudents(){
		
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			List<Student> list=session.createQuery("from Student").list();
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
