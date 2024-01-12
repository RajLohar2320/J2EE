package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.EmpAddress;

public class GetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		//MyUser u1=sess.get(MyUser.class, 10);
		//MyUser u1=sess.load(MyUser.class, 10);
		EmpAddress a1=sess.get(EmpAddress.class, 1);
		System.out.println("before");
		System.out.println(a1);

	}

}
