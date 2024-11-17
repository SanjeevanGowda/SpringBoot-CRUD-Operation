package com.student.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crudoperation.model.Student;
import com.student.crudoperation.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;

	// add only one record at a time
	public Student saveStudent(Student student) {
		return studrepo.save(student);
	}

	// add multiple records at a time
	public List<Student> saveAllStudents(List<Student> students) {
		return studrepo.saveAll(students);
	}

	// get all the students records
	public List<Student> getAll() {
		return studrepo.findAll();
	}
	// get a student record by his roll number or id value 
	public Student getById(int id) {
		return studrepo.findById(id).orElse(null);
	}
	
	//delete the student record based on their id 
	
	public String deletById(int id) {
		studrepo.deleteById(id);
		return "The student is removed !! "+id;
	}
	
	//update the student record
	
	public Student updateStudent(Student student) {
		Student existing=studrepo.findById(student.getRollno()).orElse(null);
		
		existing.setFirstname(student.getFirstname());
		existing.setLastname(student.getLastname());
		existing.setBranch(student.getBranch());
		
		return studrepo.save(existing);
	}
	
	
	
	
	
	
	
	
	
}
