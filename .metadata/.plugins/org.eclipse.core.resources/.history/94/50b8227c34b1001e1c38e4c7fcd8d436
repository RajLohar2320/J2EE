package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empTab1Add")
public class EmpAddress {
	@Id
	private int empaddid;
	private String city;
	private String state;
	@OneToOne(mappedBy="e1")
	private Employee e1;

	public EmpAddress() {
		super();
	}
	public EmpAddress(int addID, String city, String state) {
		super();
		this.empaddid = addID;
		this.city = city;
		this.state = state;
	}
	public EmpAddress(int addID, String city, String state, Employee e) {
		super();
		this.empaddid = addID;
		this.city = city;
		this.state = state;
		this.e1 = e;
	}
	public int getEmpID() {
		return empaddid;
	}
	public void setEmpID(int empID) {
		this.empaddid = empID;
	}
	public Employee getE1() {
		return e1;
	}
	public void setE1(Employee e1) {
		this.e1 = e1;
	}
	@Override
	public String toString() {
		return "EmpAddress [empaddid=" + empaddid + ", city=" + city + ", state=" + state + ", e1=" + e1 + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

