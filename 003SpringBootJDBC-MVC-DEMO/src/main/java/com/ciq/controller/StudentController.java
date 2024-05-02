package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciq.model.Student;
import com.ciq.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addStuForm")
	public String addForm() {
		return "addStu";
	}
	
	@RequestMapping(value = "/saveStu", method = RequestMethod.POST)
	public String saveStu(Student student) {
		System.out.println(student);
		studentService.add(student);
		return "redirect:/findAllStu";
	}
	@RequestMapping(value = "/updateStu", method = RequestMethod.POST)
	public String updateStu(Student student) {
		System.out.println(student);
		studentService.update(student);
		return "redirect:/findAllStu";
	}

	@RequestMapping("/findAllStu")
	public String findAllStu(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "findAll";
	}

	@RequestMapping("/deleteStuById")
	public String deleteStuById(@RequestParam("sid") Integer sid) {
		studentService.deleteById(sid);
		return "redirect:/findAllStu";
	}
	
	@RequestMapping("/updateStuById")
	public String updateStuById(@RequestParam("sid") Integer sid, Model model) {
		Student student  = studentService.findById(sid);
		
		model.addAttribute("student", student);
		return "update";
	}


}
