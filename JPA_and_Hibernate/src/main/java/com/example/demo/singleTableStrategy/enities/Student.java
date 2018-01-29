package com.example.demo.singleTableStrategy.enities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "SS")
public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String qualification;

	public Student(String name, String qualification) {
		super(name);
		this.qualification = qualification;

	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
