package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;
public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUser u1=new MyUser(10,"xxxx");
		MyUser u2=new MyUser(11,"yyyy");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();

		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();
		
		//
		Session sess1=sf.openSession();
		Transaction tr1=sess1.beginTransaction();
		
		MyUser u=sess1.get(MyUser.class, 10) ;
		System.out.println("before");
		System.out.println(u.getUname());
		System.out.println("after");
		tr1.commit();

	}

}
