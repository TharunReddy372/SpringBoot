package com.ciq.dao;

import java.util.List;

import com.ciq.model.Student;

public interface StudentDAO {
	
	public void add(Student student);
	
	public void update(Student student);
	
	public List<Student>findAll();
	
	public void deleteById(Integer sid);
	
	public Student findById(Integer sid);

}
