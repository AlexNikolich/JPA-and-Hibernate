package com.example.demo.singleTableStrategy.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.singleTableStrategy.enities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
