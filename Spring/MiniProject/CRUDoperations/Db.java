package com.arvind.wipro.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arvind.wipro.bean.Employee;

public class Db {
	
	static SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	
	public static boolean addEmp(Employee emp) {
		
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(emp);
			
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
	
	public static Employee viewEmp(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Employee emp=session.get(Employee.class, id);
			
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
	
	public static boolean deleteEmp(String id) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Employee employee=session.get(Employee.class,id);
			
			session.delete(employee);
			
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
	
	public static boolean updateEmp(String id,Employee emp) {
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Employee employee=session.get(Employee.class, id);
			
			session.delete(employee);
			
			session.save(emp);
			
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
	
	public static List<Employee> getAllEmployees(){
		
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			List<Employee> list=session.createQuery("from Employee").list();
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
