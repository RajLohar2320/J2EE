package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empTab1")
public class Employee {
	@Id
	private int empID;
	private String ename;
	private double sal;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="empaddid")
	private EmpAddress e1;
	public Employee() {
		super();
	}
	public Employee(int empID, String ename, double sal, EmpAddress e1) {
		super();
		this.empID = empID;
		this.ename = ename;
		this.sal = sal;
		this.e1 = e1;
	}
	public EmpAddress getE1() {
		return e1;
	}
	public void setE1(EmpAddress e1) {
		this.e1 = e1;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", ename=" + ename + ", sal=" + sal + "]";
	}
}

