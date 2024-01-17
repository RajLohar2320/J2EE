package com.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pub_Bar {
	@Autowired
	private Person p;
	public Pub_Bar() {
		super();
		System.out.println("----- KALI RAAT -----");
		System.out.println("-------- BAR --------");
	}
	public void chekIN() {
		System.out.println("CheckIn");
	}
	public void chekOUT() {
		System.out.println("CheckOut");
	}
}
