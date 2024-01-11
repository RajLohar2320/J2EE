package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class EmployeeTestMav {

	public static void main(String[] args) {
		Employee e1=new Employee(14,"Omkar",3456);
		Employee e2=new Employee(15,"Shahrukh",5555);
		Employee e3=new Employee(17,"Krantiiiveer",4545);

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
				
		tr.commit();
		session.close();
				
		
		Session sess1=sf.openSession();
		Transaction tr1=sess1.beginTransaction();
				
		Employee emp1=sess1.load(Employee.class, 14);
		System.out.println("before");
		System.out.println(emp1);  // calls load method
		System.out.println("after");
		tr1.commit();		
	}
}
