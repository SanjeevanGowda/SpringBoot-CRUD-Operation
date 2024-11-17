package com.student.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.crudoperation.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	

}
