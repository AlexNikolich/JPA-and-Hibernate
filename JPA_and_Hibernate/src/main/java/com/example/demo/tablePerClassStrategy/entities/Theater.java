package com.example.demo.tablePerClassStrategy.entities;

import javax.persistence.Entity;

@Entity
public class Theater extends Art{

	private String location;

	public Theater(String name, String location) {
		super(name);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
