package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.joinTableStrategy.entities.Basket;
import com.example.demo.joinTableStrategy.entities.Football;
import com.example.demo.joinTableStrategy.repository.BasketRepository;
import com.example.demo.joinTableStrategy.repository.FootballRepository;
import com.example.demo.singleTableStrategy.enities.Staff;
import com.example.demo.singleTableStrategy.enities.Student;
import com.example.demo.singleTableStrategy.enities.Teacher;
import com.example.demo.singleTableStrategy.repository.StaffRepository;
import com.example.demo.singleTableStrategy.repository.StudentRepository;
import com.example.demo.singleTableStrategy.repository.TeacherRepository;
import com.example.demo.tablePerClassStrategy.entities.Cinema;
import com.example.demo.tablePerClassStrategy.entities.Theater;
import com.example.demo.tablePerClassStrategy.repository.CinemaRepository;
import com.example.demo.tablePerClassStrategy.repository.TheaterRepository;




@Component
public class H2table implements CommandLineRunner {

	//Example 1
	@Autowired
	StudentRepository st;
	@Autowired
	TeacherRepository tr;
	@Autowired
	StaffRepository sf;
	
	
	//EXAMPLE 2
	@Autowired
	FootballRepository fr;
	@Autowired
	BasketRepository br;
	
	
	//EXAMPLE 3
	@Autowired
	CinemaRepository cr;
	@Autowired
	TheaterRepository thr;
	
	
	
	@Override
	public void run(String... arg0) throws Exception {
		
//		EXAMPLE 1 -  Single Table Strategy - one table is created->Superclass(Person)
//			- One super class and two (or more) subclass(Staff, Student, Teacher)
//			makes one table an adding column @DiscriminatorValue(value = "SS")
//			 from subclasses. Super constructor to init property from Superclass.
//			If subclasses have same properties -> table will have only
//			one column
		System.out.println("POPUNJAVA TABLICU!!!!!!!!!!!!!!!!!!!!!!");
		Student s1 = new Student("Sale", "First semestar");
		st.save(s1);
		Teacher t1 = new Teacher("Diana", "Master");
		tr.save(t1);
		Staff sf1 = new Staff("Dejan", "PhD");
		sf.save(sf1);
		System.out.println("Sve zavrseno!!!");
		
		
		
//		EXAMPLE 2 - Join Table Strategy - create all tables -> superclass(Sport) an all subclasses(Football, Basket)
//			- all subclasses have PrimaryKeyJoinColumn(with quotes)-> primary key from superclass
//			- Superclass table has all properties from superclass only. Subclasses has specific ID from superclass and 
//			  properties in the subclass only. 
		Football f = new Football("Alex", "forward");
		fr.save(f);
		Basket b = new Basket("Diana", "Toronto");
		br.save(b);
		
		
//		EXAMPLE 3 - Table Per Class - superclass(Art), subclass(Cinema, Theater)
//			- Superclasshas all properties null, every subclass has own table with properties
//			- ID in Supeclass MUST -  @GeneratedValue(strategy = GenerationType.TABLE)
//			- NOT .AUTO -> MUST .TABLE
		Cinema c1 = new Cinema("Cineplex", "Star Trek");
		cr.save(c1);
		Theater th1 = new Theater("Sony", "King");
		thr.save(th1);
		
	}
	

}
