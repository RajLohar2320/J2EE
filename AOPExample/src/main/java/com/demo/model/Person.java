package com.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("Rishit")
	private String pname;
	@Value("19")
	private int age;
	
	public Person() {
		super();
	}
	public Person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + pname + ", Age=" + age + "]";
	}
	
}
