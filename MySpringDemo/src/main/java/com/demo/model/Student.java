package com.demo.model;

import java.util.List;

public class Student {
	private int Sid;
	private String Sname;
	private List<Skill> slist;
	private List<String> Hobbies;
	public Student() {
		super();
	}
	public Student(int sid, String sname, List<Skill> slist, List<String> hobbies) {
		super();
		Sid = sid;
		Sname = sname;
		this.slist = slist;
		Hobbies = hobbies;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public List<Skill> getSlist() {
		return slist;
	}
	public void setSlist(List<Skill> slist) {
		this.slist = slist;
	}
	public List<String> getHobbies() {
		return Hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		Hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", slist=" + slist + ", Hobbies=" + Hobbies + "]";
	}
	
	
	
}
