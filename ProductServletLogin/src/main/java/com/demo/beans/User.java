package com.demo.beans;

public class User {
	private int pId;
	private String uname;
	private String pass;
	private String role;
	public User() {
		this.pId = 0;
		this.uname = null;
		this.pass = null;
		this.role = null;
	}
	public User(int pid, String uname, String pass, String role) {
		this.pId = pid;
		this.uname = uname;
		this.pass = pass;
		this.role = role;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String toString() {
		return "P_ID "+this.pId+" [ UserName: "+this.uname+", Password: "+this.pass+", Role: "+this.role;
	}
}
