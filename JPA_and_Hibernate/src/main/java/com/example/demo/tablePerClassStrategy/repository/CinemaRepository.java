package com.example.demo.tablePerClassStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tablePerClassStrategy.entities.Cinema;

public interface CinemaRepository extends CrudRepository<Cinema, Serializable>{

}
