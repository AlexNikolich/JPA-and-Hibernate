package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Dog;

public interface DogRepository extends CrudRepository<Dog, Serializable>{

}
