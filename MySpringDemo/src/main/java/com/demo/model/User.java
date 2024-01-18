package com.demo.model;

public class User {
	private int uid;
	private String uname;
	private UserAdd add;
	public User() {
		super();
	}
	public User(int uid, String uname, UserAdd add) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.add = add;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public UserAdd getAdd() {
		return add;
	}
	public void setAdd(UserAdd add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [ID =" + uid + ", Name =" + uname + ", Add =" + add + "]";
	}
	
}
