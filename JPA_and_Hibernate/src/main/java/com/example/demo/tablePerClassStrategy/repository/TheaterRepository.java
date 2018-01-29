package com.example.demo.tablePerClassStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tablePerClassStrategy.entities.Theater;

public interface TheaterRepository extends CrudRepository<Theater, Serializable>{

}
