package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.model.*;
public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Person p = (Person) ctx.getBean("person");
		Pub_Bar pb = (Pub_Bar) ctx.getBean("pub_Bar");
	}

}
