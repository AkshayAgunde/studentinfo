package com.neoquant.student.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoquant.student.model.Student;
import com.neoquant.student.repository.AddressRepository;
import com.neoquant.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	@Autowired
	private AddressRepository addres;

	public List<Student> listAllStudentInfo(){
		return studentrepository.findAll();
	}
	public void saveStudent(Student student) {
		studentrepository.save(student);
	}
	public Student getStudenById(Integer id) {
		return studentrepository.findById(id).get();
	}
	public void deleteStudenById(Integer id) {
		studentrepository.deleteById(id);
	}

}

