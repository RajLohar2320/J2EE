package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.model.*;
public class TestSpring {

	public static void main(String[] args) {
//		String[] files = {"springconfig.xml","springconfig2.xml"};
		ApplicationContext actx = new ClassPathXmlApplicationContext("springconfig2.xml");
//		User u = (User) actx.getBean("u1");
//		System.out.println(u);
		
		Student s = (Student) actx.getBean("s1");
		System.out.println(s);
	}

}