package com.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="DepartmentTab")
public class Department {
	@Id
	private int dId;
	private String dName;
	@OneToMany(mappedBy="dept", cascade = CascadeType.ALL)
	private List<Employee> elist ;
	
	public Department() {
		super();
	}
	public Department(int dId, String dName, List<Employee> elist) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.elist = elist;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	@Override
	public String toString() {
		return "Department [Dept ID=" + dId + ", Dept Name=" + dName + "]";
	}
	
}
