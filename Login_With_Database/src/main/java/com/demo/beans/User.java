package com.demo.beans;

public class User {
	private String uname;
	private String pass;
	private String email;
	public User(String uname, String pass) {
		this.uname = uname;
		this.pass = pass;
		this.email = null;
	}
	public User(String uname, String pass, String email) {
		this.uname = uname;
		this.pass = pass;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [Username = " + uname + ", Pass = " + pass + ", Email = " + email + "]";
	}
	
}
