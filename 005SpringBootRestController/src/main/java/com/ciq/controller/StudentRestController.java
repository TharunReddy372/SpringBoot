package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.model.Student;
import com.ciq.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/rest")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/findAll")
	public List<Student> restFindAll() {
		List<Student> students = studentService.findAll();
		return students;
		
	}
	
	@GetMapping("findById")
	public Student findById(@RequestParam("sid") Integer sid) {
		Student student = studentService.findById(sid);
		return student;
		
	}
	
	@DeleteMapping("/deleteById/{sid}")
	public String deleteById(@PathVariable("sid")Integer sid) {
		studentService.deleteById(sid);
		
		return "Student Deleted Successfully with Sid "+sid;
		
	}
	
	@PostMapping("/saveStu")
	public String saveStu(@RequestBody Student student) {
		
		studentService.add(student);
		return "Student Saved Successfully with Sid "+ student.getSid();
	}
	
	@PutMapping("/updateStu")
	public String updateStu(@RequestBody Student student) {
		studentService.update(student);
		
		return "Student Updated Successfully with Sid "+student.getSid();
	}
	
	

}
