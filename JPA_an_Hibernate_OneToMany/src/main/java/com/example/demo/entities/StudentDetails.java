package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String course;
	
	@ManyToOne
	private Student student;

	public StudentDetails(String course) {
		super();
		this.course = course;
	}
	
	

	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
