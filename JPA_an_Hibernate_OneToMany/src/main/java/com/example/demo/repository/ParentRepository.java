package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bidirectional.entities.Parent;

public interface ParentRepository extends CrudRepository<Parent, Serializable>{

}
