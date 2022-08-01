package com.neoquant.student.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoquant.student.model.Student;
import com.neoquant.student.model.StudentAddress;
import com.neoquant.student.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@GetMapping(value="/getall")
	public List<Student> list(){
		return studentservice.listAllStudentInfo();
	}

	@PostMapping(value="/add")
	public String add(@RequestBody Student student) {
		studentservice.saveStudent(student);
		return "New Student Added";
	}
	@GetMapping(value="/get/{id}")
	public ResponseEntity<Student> getStudenById(@PathVariable Integer id){
		try {
			Student student=studentservice.getStudenById(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping(value="/update/{id}")
	public ResponseEntity<Student> update(@RequestBody Student student,@PathVariable Integer id){
		try {
			Student existingStudent=studentservice.getStudenById(id);
			studentservice.saveStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable Integer id) {
		studentservice.deleteStudenById(id);
		return "Deleted Student with id"+id;
	}
	
}
