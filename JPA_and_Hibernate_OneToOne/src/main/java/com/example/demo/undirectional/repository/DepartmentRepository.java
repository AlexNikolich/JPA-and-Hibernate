package com.example.demo.undirectional.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.undirectional.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Serializable>{

}
