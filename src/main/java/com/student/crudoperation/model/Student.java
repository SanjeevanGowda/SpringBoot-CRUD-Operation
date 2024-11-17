package com.student.crudoperation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String branch;
	
	public Student() {
		
	}
	
	
	public Student(String firstname, String lastname, String branch) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.branch = branch;
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", branch="
				+ branch + "]";
	}
	
}
