package com.example.demo.singleTableStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.singleTableStrategy.enities.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Serializable>{

}
