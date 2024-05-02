package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ciq.model.Employee;
import com.ciq.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/addEmpForm")
	public String addEmpForm() {
		return "addEmp";
	}

	@PostMapping(value = "/saveEmp")
	public String saveEmp(Employee employee) {
		System.out.println(employee);
		employeeService.add(employee);
		return "redirect:/findAllEmp";
	}

	@PostMapping(value = "/updateEmp")
	public String updateEmp(Employee employee) {
		System.out.println(employee);
		employeeService.update(employee);
		return "redirect:/findAllEmp";
	}

	@GetMapping("/findAllEmp")
	public String findAllEmp(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "findAll";
	}

	@GetMapping("/deleteEmpById")
	public String deleteEmpById(@RequestParam("eid") Integer eid) {
		employeeService.deleteById(eid);
		return "redirect:/findAllEmp";
	}

	@GetMapping("/updateEmpById")
	public String updateEmpById(@RequestParam("eid") Integer eid, Model model) {
		Employee employee = employeeService.findById(eid);

		model.addAttribute("employee", employee);
		return "updateEmp";
	}

	

}
