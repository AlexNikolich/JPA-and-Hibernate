package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Serializable>{

}
