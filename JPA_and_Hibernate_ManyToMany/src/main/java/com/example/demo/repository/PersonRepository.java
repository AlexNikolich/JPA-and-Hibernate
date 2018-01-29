package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Serializable>{

}
