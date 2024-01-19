package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String desc;
	public Product() {
		super();
	}
	public Product(int pid, String desc) {
		super();
		this.pid = pid;
		this.desc = desc;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Product [PID=" + pid + ", DESC=" + desc + "]";
	}
	
}
