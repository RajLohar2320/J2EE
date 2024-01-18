package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		//it is in transient state
		Employee e1=new Employee(14,"Omkar",3456);
		Employee e2=new Employee(15,"Shahrukh",5555);
		Employee e3=new Employee(17,"Krantiiiveer",4545);

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		// to insert data
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//e1 is in persistent state
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		tr.commit();
		session.close();
		
		//to retrieve data
		Session sess1=sf.openSession();
		Transaction tr1=sess1.beginTransaction();
		
		Employee emp1=sess1.load(Employee.class, 14);
//		Employee emp1=sess1.get(Employee.class, 14);
		System.out.println("before");
		System.out.println(emp1.getEname());  // calls load method
		System.out.println("after");
		tr1.commit();
		
		
	}

}