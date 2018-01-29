package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Serializable>{

}
