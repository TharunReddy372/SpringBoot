package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Student student) {
		jdbcTemplate.update("INSERT INTO STUDENT_TAB VALUES(?,?,?)",new Object[] {student.getSid(),student.getSname(),student.getSfee()});
		
	}

	@Override
	public void update(Student student) {
		jdbcTemplate.update("UPDATE STUDENT_TAB SET SNAME = ?, SFEE = ? WHERE SID = ? ", new Object[] {student.getSname(),student.getSfee(), student.getSid()});
	}

	@Override
	public List<Student> findAll() {
		return jdbcTemplate.query("SELECT * FROM STUDENT_TAB", new BeanPropertyRowMapper(Student.class));
	}

	@Override
	public void deleteById(Integer sid) {
		jdbcTemplate.update("DELETE FROM STUDENT_TAB WHERE SID=?",new Object[] {sid});
	}

	@Override
	public Student findById(Integer sid) {
		return (Student) jdbcTemplate.queryForObject("SELECT * FROM STUDENT_TAB WHERE SID = ? ", new Object[] {sid} ,new BeanPropertyRowMapper(Student.class));
	}

}
