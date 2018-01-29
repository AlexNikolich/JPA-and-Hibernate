package com.example.demo.tablePerClassStrategy.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cinema extends Art implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String movie;

	public Cinema(String name, String movie) {
		super(name);
		this.movie = movie;
	}

	



	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	
	
	
	
}
