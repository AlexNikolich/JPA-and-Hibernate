package com.example.demo.singleTableStrategy.enities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "SF")
public class Staff extends Person{

	private String degree;//same property in Teacher

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String degree) {
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
