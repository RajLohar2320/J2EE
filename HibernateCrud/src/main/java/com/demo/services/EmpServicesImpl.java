package com.demo.services;

import java.util.List;
import com.demo.dao.*;
import com.demo.model.Employee;

public class EmpServicesImpl implements EmployeeServices{
	EmployeeDao edao;
	public EmpServicesImpl() {
		edao = new EmpDaoImpl();
	}
	
	public List<Employee> showAll() {
		return edao.getAll();
	}

	public boolean insert(Employee e) {
		return edao.save(e);
	}

	public boolean delete(int id) {
		return edao.deleteById(id);
	}

	public Employee get(int id) {
		return edao.getEmpById(id);
	}

	public boolean update(Employee e) {
		return edao.upEmpById(e);
	}

}
