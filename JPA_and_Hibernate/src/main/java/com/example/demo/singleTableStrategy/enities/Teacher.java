package com.example.demo.singleTableStrategy.enities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="TS")
public class Teacher extends Person{
	
	private String degree;//same property in Staff

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name,String degree) {
		super(name);
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	
	
	

}
