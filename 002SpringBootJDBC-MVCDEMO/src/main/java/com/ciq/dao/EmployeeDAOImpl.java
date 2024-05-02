package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	 
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMPLOYEE_TAB VALUES(?,?,?)", new Object[] {employee.getEid(),employee.getEname(),employee.getEsal()});
		
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_TAB", new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMPLOYEE_TAB WHERE EID = ?", new Object[] {eid});
	}

	@Override
	public Employee findById(Integer eid) {
		return (Employee) jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE_TAB WHERE EID = ?",new Object[] {eid}, new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMPLOYEE_TAB SET ENAME = ?, ESAL = ? WHERE EID = ? ", new Object[] {employee.getEname(),employee.getEsal(), employee.getEid()});
	}

}
