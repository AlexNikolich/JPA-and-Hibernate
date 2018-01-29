package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.StudentDetails;

public interface StudentDetailsRepository extends CrudRepository<StudentDetails, Serializable>{

}
