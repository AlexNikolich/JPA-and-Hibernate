package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Dog;
import com.example.demo.entities.Person;
import com.example.demo.repository.DogRepository;
import com.example.demo.repository.PersonRepository;

import javassist.expr.NewArray;

@Component
public class ManyToMany implements CommandLineRunner{

	@Autowired
	PersonRepository pr;
	
	@Autowired
	DogRepository dr;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Person p1 = new Person("alex");
		Person p2 = new Person("diana");
		Person p3 = new Person("mili");
		
		pr.save(p1);
		pr.save(p2);
		pr.save(p3);
		
		List<Person> lp = new ArrayList<>();
		lp.add(p1);
		lp.add(p3);
		
		List<Person> lp1 = new ArrayList<>();
		lp1.add(p2);
		lp1.add(p3);
		
		List<Person> lp2 = new ArrayList<>();
		lp2.add(p1);
		lp2.add(p2);
		
		
		Dog g1 = new Dog("black");
		Dog g2 = new Dog("white");
		Dog g3 = new Dog("brown");
		
		g1.setPersons(lp);
		g2.setPersons(lp1);
		g3.setPersons(lp2);
		
		List<Dog> lg = new ArrayList<>();
		lg.add(g1);
		lg.add(g2);
		lg.add(g3);
		
		dr.save(lg);
		
		
		
		//RESULT 4 tables
		
//		TABLE 1
//		SELECT * FROM DOG;
//		ID  	COLOUR  
//		1		black
//		2		white
//		3		brown
//		(6 rows, 3 ms)
//		
//		TABLE 2
//		SELECT * FROM DOG_PERSONS;
//		DOG_ID  	PERSONS_ID  
//		1				1
//		1				3
//		2				2
//		2				3
//		3				1
//		3				2
//		
//		TABLE 3
//		SELECT * FROM PERSON;
//		ID  	NAME  
//		1		alex
//		2		diana
//		3		mili
//		
//		TABLE 4
//		SELECT * FROM PERSON_DOGS;
//		PERSON_ID  	DOGS_ID  

		
		
	}

}
