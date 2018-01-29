package com.example.demo.singleTableStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.singleTableStrategy.enities.Student;

public interface StudentRepository extends CrudRepository<Student, Serializable>{

}
