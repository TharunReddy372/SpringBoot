package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciq.model.Employee;
import com.ciq.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/addEmpForm")
	public String addEmpForm() {
		return "addEmp";
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public String saveEmp(Employee employee) {
		System.out.println(employee);
		employeeService.add(employee);
		return "redirect:/findAllEmp";
	}
	
	
	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmp(Employee employee) {
		System.out.println(employee);
		employeeService.update(employee);
		return "redirect:/findAllEmp";
	}

	@RequestMapping("/findAllEmp")
	public String findAllEmp(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "findAll";
	}

	@RequestMapping("/deleteEmpById")
	public String deleteEmpById(@RequestParam("eid") Integer eid) {
		employeeService.deleteById(eid);
		return "redirect:/findAllEmp";
	}
	
	@RequestMapping("/updateEmpById")
	public String updateEmpById(@RequestParam("eid") Integer eid, Model model) {
		Employee employee  = employeeService.findById(eid);
		
		model.addAttribute("employee", employee);
		return "updateEmp";
	}

}
