package com.student.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.crudoperation.model.Student;
import com.student.crudoperation.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studservice;

	// add only one recore at a time
	@PostMapping("/addstudent")
	public Student addstudent(@RequestBody Student student) {
		return studservice.saveStudent(student);
	}

	// add multiple students at time
	@PostMapping("/addallstudents")
	public List<Student> addAllStudents(@RequestBody List<Student> students) {
		return studservice.saveAllStudents(students);
	}

	// get all students records
	@GetMapping("/findall")
	public List<Student> getall() {
		return studservice.getAll();
	}
	// get student records based on id or roll number

	@GetMapping("findbyid/{id}")
	public Student findById(@PathVariable int id) {
		return studservice.getById(id);
	}

	//delete the particular student based on their id or roll number 
	
	@DeleteMapping("/deletestud/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studservice.deletById(id);
	}
	
	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		return studservice.updateStudent(student);
	}

}
