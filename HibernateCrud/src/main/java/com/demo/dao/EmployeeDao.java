package com.demo.dao;
import java.util.List;

import com.demo.model.*;
public interface EmployeeDao {
	public List<Employee> getAll();
	public boolean save(Employee e);
	public boolean deleteById(int id);
	public Employee getEmpById(int id); 
	public boolean upEmpById(Employee e); 
}
