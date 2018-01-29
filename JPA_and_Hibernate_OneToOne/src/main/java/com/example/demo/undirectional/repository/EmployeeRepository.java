package com.example.demo.undirectional.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.undirectional.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{

}
