package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeDAO {
	public void add(Employee employee);
	
	public void deleteById(Integer eid);

	public List<Employee> findAll();

	public Employee findById(Integer eid);

	public void update(Employee employee);
	
	
}
