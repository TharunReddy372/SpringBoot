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
import org.springframework.web.bind.annotation.RestController;

import com.ciq.constents.ResponseCode;
import com.ciq.model.Employee;
import com.ciq.model.ResponseObj;
import com.ciq.service.EmployeeService;

@RestController
@RequestMapping("/rest/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseObj save(@RequestBody Employee employee) {
		employeeService.add(employee);
		ResponseObj responseObj = new ResponseObj(ResponseCode.CREATED.code, "Inserted Successfully ");
		return responseObj;
	}

	@PutMapping
	public ResponseObj update(@RequestBody Employee employee) {
		employeeService.add(employee);
		ResponseObj responseObj = new ResponseObj(ResponseCode.UPDATED.code, "Updated Successfully ");
		return responseObj;
	}

	@DeleteMapping("{eid}")
	public ResponseObj delete(@PathVariable("eid") Integer eid) {
		employeeService.deleteById(eid);
		ResponseObj responseObj = new ResponseObj(ResponseCode.DELETED.code, "Deleted Successfully ");
		return responseObj;
	}

	@GetMapping("{eid}")
	public ResponseObj findById(@PathVariable("eid") Integer eid) {
		Employee employee = employeeService.findById(eid);

		if (employee != null) {
			ResponseObj responseObj = new ResponseObj(ResponseCode.OK.code, employee);
			return responseObj;
		} else {
			ResponseObj responseObj = new ResponseObj(ResponseCode.NOTFOUND.code, "Record Not Found  ");
			return responseObj;
		}
	}
	
	

	@GetMapping
	public ResponseObj findAll() {
		List<Employee> employees = employeeService.findAll();

		if (employees != null) {
			ResponseObj responseObj = new ResponseObj(ResponseCode.OK.code, employees);
			return responseObj;
		} else {
			ResponseObj responseObj = new ResponseObj(ResponseCode.NOTFOUND.code, "No Records Found in DB ");
			return responseObj;
		}
	}

}
