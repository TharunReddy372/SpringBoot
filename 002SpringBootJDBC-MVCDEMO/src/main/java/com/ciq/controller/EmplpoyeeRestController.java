package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.model.Employee;
import com.ciq.service.EmployeeService;

@RestController
@RequestMapping("/rest")
public class EmplpoyeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/findAll")
	public List<Employee> restFindAll() {
		List<Employee> employees = employeeService.findAll();
		return employees;
	}

	@GetMapping("/findById")
	public Employee findById(@RequestParam("eid") Integer eid) {
		Employee employee = employeeService.findById(eid);
		return employee;
	}
	
	
	@DeleteMapping("/deleteById/{eid}")
	public String deleteById(@PathVariable("eid") Integer eid) {
		employeeService.deleteById(eid);
		return "Employee Deleted Successfully with Eid "+eid;
	}
	
	@PostMapping("/saveEmp")
	public String saveEmp(@RequestBody Employee employee) {
		employeeService.add(employee);
		return "Employee save Successfully with Eid "+employee.getEid();
	}
	
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee employee) {
		employeeService.update(employee);
		return "Employee updated Successfully with Eid "+employee.getEid();
	}
	
}
