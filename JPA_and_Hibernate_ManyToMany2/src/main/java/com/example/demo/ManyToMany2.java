package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Course;
import com.example.demo.entities.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@Component
public class ManyToMany2 implements CommandLineRunner{

	@Autowired
	StudentRepository sr;
	
	@Autowired
	CourseRepository cr;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student st1 = new Student("sale");
		Student st2 = new Student("diana");
		Student st3 = new Student("mili");
		
		List<Student> ls1 = new ArrayList<>();
		ls1.add(st1);
		ls1.add(st2);
		List<Student> ls2 = new ArrayList<>();
		ls2.add(st1);
		ls2.add(st3);
		List<Student> ls3 = new ArrayList<>();
		ls3.add(st2);
		ls3.add(st3);
		
		Course c1 = new Course(10);
		Course c2 = new Course(20);
		Course c3 = new Course(30);
		
		c1.setStudents(ls1);
		c2.setStudents(ls2);
		c3.setStudents(ls3);
		
		List<Course> lc = new ArrayList<>();
		
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		
		cr.save(lc);
		
		// RESULT - THREE TABLES
		
//		SELECT * FROM STUDENT;
//		ID  	NAME  
//		1		sale
//		2		diana
//		3		mili
//		
//		SELECT * FROM STUDENT;
//		ID  	NAME  
//		1		sale
//		2		diana
//		3		mili
//		
//		SELECT * FROM STUDENT_COURSE;
//		STUDENT_ID  	DOG_ID  
//		1					1
//		1					2
//		2					1
//		2					3
//		3					2
//		3					3
		
		
		
	}

}
