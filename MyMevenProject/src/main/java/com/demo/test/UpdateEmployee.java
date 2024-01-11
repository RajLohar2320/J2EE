package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Employee p1=session.get(Employee.class,14); //persistent
		session.close();
		//now product is in dettached state
		p1.setEname("Ramesh");
		
		//reattaching session
		Session session1=sf.openSession();
		Employee p2=session1.get(Employee.class,14); //persistent
		System.out.println("before commit "+p2);
		Transaction tr2=session1.beginTransaction();
		//throw an exception NonUniqueObjectException
		//session1.update(p1);
		//session1.saveOrUpdate(p1);
		session1.merge(p1);
		tr2.commit();
		session1.close();
		
		sf.close();

	}

}
