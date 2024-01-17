package com.demo.services;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeServices {
	public List<Employee> showAll();
	public boolean insert(Employee e);
	public boolean delete(int id);
	public Employee get(int id);
	public boolean update(Employee e);
}
