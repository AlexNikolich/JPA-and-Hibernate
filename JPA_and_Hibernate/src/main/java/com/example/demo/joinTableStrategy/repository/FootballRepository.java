package com.example.demo.joinTableStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.joinTableStrategy.entities.Football;

public interface FootballRepository extends CrudRepository<Football, Serializable>{

}
