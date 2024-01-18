package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.EmpAddress;
import com.demo.model.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		EmpAddress addr=new EmpAddress(1,"Banglore", "MH");
		EmpAddress addr1=new EmpAddress(2,"Abu Dhabi","Hydrabad");
		Employee e1=new Employee(11,"Ramesh",35000, addr);
		Employee e2=new Employee(12,"Suresh",40000, addr1);
		addr.setE1(e1);
		addr1.setE1(e2);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(addr);
		sess.save(addr1);
		sess.save(e1);
		sess.save(e2);
		
		tr.commit();
		System.out.println("Data Inserted Successfully 😊");

	}

}
