package com.example.demo.singleTableStrategy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.singleTableStrategy.enities.Staff;

public interface StaffRepository extends CrudRepository<Staff, Serializable>{

}
