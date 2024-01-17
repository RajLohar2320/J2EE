package com.demo.test;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;
public class OneToManyTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"John", 35000);
		Employee e2 = new Employee(2,"Ramesh", 25000);
		Employee e3 = new Employee(3,"Rakesh", 45000);
		Employee e4 = new Employee(4,"Ratan", 66000);
		List<Employee> elist1 = new ArrayList<Employee>();
		elist1.add(e1);
		elist1.add(e2);
		elist1.add(e4);
		List<Employee> elist2 = new ArrayList<Employee>();
		elist2.add(e1);
		elist2.add(e3);
		Department d1 = new Department(223,"Banking",elist1);
		Department d2 = new Department(436,"Management",elist2);
		e1.setDept(d2);
		e1.setDept(d1);
		e2.setDept(d1);
		e3.setDept(d2);
		e4.setDept(d1);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(d1);
		s1.save(d2);
		s1.save(e1);
		s1.save(e2);
		s1.save(e3);
		s1.save(e4);
		tr.commit();
		s1.close();
		sf.close();
		
	}
}
