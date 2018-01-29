package com.example.demo.joinTableStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.joinTableStrategy.entities.Sport;

public interface SprotRepository extends CrudRepository<Sport, Serializable>{

}
