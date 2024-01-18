package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empTab1Add")
public class EmpAddress {
	@Id
	private int empaddid;
	private String city;
	private String state;
	
	public EmpAddress() {
		super();
	}
	public EmpAddress(int addID, String city, String state) {
		super();
		this.empaddid = addID;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "EmpAddress [empID=" + empaddid + ", city=" + city + ", state=" + state + "]";
	}
	public int getEmpID() {
		return empaddid;
	}
	public void setEmpID(int empID) {
		this.empaddid = empID;
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

