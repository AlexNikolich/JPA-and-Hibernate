package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bidirectional.entities.Child;

public interface ChildRepository extends CrudRepository<Child, Serializable>{

}
