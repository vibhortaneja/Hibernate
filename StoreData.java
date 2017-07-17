package com.niit.training;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Employee;

public class StoreData {

	public static Session getSession(){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	
		SessionFactory factory = cfg.buildSessionFactory();

		
		Session session = factory.openSession();
		return session;
	}

	public static void main(String args[]){
		Session session = getSession();
		
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(116);
		e1.setFirstName("Vibhor");
		e1.setLastName("Taneja");
		session.persist(e1);// persisting the object
		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}

	public static Employee getEmployee(final int id) {
		return null;
	}

	public static List<Employee> getaAllEmployees() {
		Session session = getSession();
		Query query =session.createQuery("");
		List list = query.list();
		return null;
	}
}
