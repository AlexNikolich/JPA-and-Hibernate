package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bidirectional.entities.Child;
import com.example.demo.bidirectional.entities.Parent;
import com.example.demo.entities.Student;
import com.example.demo.entities.StudentDetails;
import com.example.demo.repository.ChildRepository;
import com.example.demo.repository.ParentRepository;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.repository.StudentRepository;

@Component
public class OneToMany implements CommandLineRunner{

	@Autowired
	StudentRepository sr;
	
	@Autowired
	StudentDetailsRepository sdr;
	
	//EXAMPLE 2
	@Autowired
	ParentRepository pr;
	
	@Autowired 
	ChildRepository cr;
	
	@Override
	public void run(String... args) throws Exception {
		
		//EXAMPLE 1 - make three tables(Student, StudentDetails, Student_StuentDetail)
			// three tables because we don't have mappeBy
		Student st = new Student("Alex");
		sr.save(st);
		
		List<StudentDetails> sd = new ArrayList<StudentDetails>();
		StudentDetails s1 = new StudentDetails("java");
		s1.setStudent(st);
		StudentDetails s2 = new StudentDetails("c++");
		s2.setStudent(st);
		
		sd.add(s1);
		sd.add(s2);
		
		sdr.save(sd);
		
		
		//EXAMPLE 2 - two table Parent and Child
			// we are using mapedBy (without 3 table)
		
//		Parent pa = new Parent("sale");
//		pr.save(pa);
//		
//		Child ch1 = new Child("aleksa");
//		Child ch2 = new Child("milica");
//		
//		ch1.setParent(pa);
//		ch2.setParent(pa);
//		
//		List<Child> ch = new ArrayList<>();
//		ch.add(ch1);
//		ch.add(ch2);
//		cr.save(ch);
		
		//Examle 3 - two classes Parent an Child
			// two table (we are using mappedBy)
			// cascade = CascadeType.ALL - only we need to save Child object and
			// Parent is also save.Cascade works only if the class is the owner of
			// relationship. (Child)
		
		Parent pa = new Parent("sale");
		
		Child ch1 = new Child("aleksa");
		Child ch2 = new Child("milica");
		
		ch1.setParent(pa);
		ch2.setParent(pa);
		
		List<Child> ch = new ArrayList<>();
		ch.add(ch1);
		ch.add(ch2);
		cr.save(ch);
	}

}
