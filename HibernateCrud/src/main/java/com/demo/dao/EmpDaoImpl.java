package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.model.Employee;
import org.hibernate.query.Query;

public class EmpDaoImpl implements EmployeeDao{
	private static SessionFactory sf;
	static {
		sf = HibernateUtil.getSessionFactory();
	}
	public List<Employee> getAll() {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		Query query=s1.createQuery("from Employee");
		List<Employee> elist = query.list();
		tr.commit();
		s1.close();
		return elist;
	}

	public boolean save(Employee e) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(e);
		tr.commit();
		s1.close();
		return true;
	}

	public boolean deleteById(int id) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		Employee emp =s1.get(Employee.class, id);
		if(emp!=null) {
			s1.delete(emp);
			tr.commit();
			s1.close();
			return true;
		}
		s1.close();
		return false;
	}

	public Employee getEmpById(int id) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		Employee emp =s1.get(Employee.class, id);
		return emp;
	}

	public boolean upEmpById(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
