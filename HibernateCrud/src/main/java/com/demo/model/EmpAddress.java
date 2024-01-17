package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
public class EmpAddress {
	private int empID;
	private String city;
	private String state;

	public EmpAddress() {
		super();
	}
	public EmpAddress(int addID, String city, String state) {
		this.empID = addID;
		this.city = city;
		this.state = state;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	@Override
	public String toString() {
		return "EmpAddress [empID=" + empID + ", city=" + city + ", state=" + state + "]";
	}
}
