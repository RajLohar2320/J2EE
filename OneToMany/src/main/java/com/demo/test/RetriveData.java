package com.demo.test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class RetriveData {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		Department d = s1.load(Department.class, 223);
		System.out.println(d);
		Employee e = s1.get(Employee.class, 2);
		System.out.println(e);
		tr.commit();
		s1.close();
		sf.close();

	}

}
