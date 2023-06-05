package com.ozkan.studentmanagementsystem;

import com.ozkan.studentmanagementsystem.entity.Student;
import com.ozkan.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		/*Student student1 = new Student(1L,"Ozkan", "Baltaoglu", "o.baltaoglu@blamail.com");
		studentRepository.save(student1);

		Student student2 = new Student(2L,"Deniz", "Baltaoglu", "a.baltaoglu@blamail.com");
		studentRepository.save(student2);

		Student student3 = new Student(3L,"Gökce", "Baltaoglu", "g.baltaoglu@blamail.com");
		studentRepository.save(student3);*/



	}
}
