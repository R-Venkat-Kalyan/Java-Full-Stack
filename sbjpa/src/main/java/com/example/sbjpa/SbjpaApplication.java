package com.example.sbjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbjpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner clr(StudentDAO stuDao) {
		
		return runner -> {
//			createStudent(stuDao);
			getStudent(stuDao);
//			updateStudent(stuDao);
//			deleteStudent(stuDao);
		};
	}

//	private void createStudent(StudentDAO stuDao) {
//		// TODO Auto-generated method stub
//		Student s1 = new Student("Reddy","Kalyan",30959);
//		stuDao.insertStudent(s1);
//		System.out.println("Insertion success");
//	}
	
	private void getStudent(StudentDAO stuDao) {
	  Student s1 = new Student("Reddy","Kalyan",30959);
	  Student retrievedStudent = stuDao.getStudentById(s1.getId());
      System.out.println("Retrieved Student: " + retrievedStudent.getId());
	}
//
//	private void updateStudent(StudentDAO stuDao) {
//      // Update the student's information
//		Student s1 = new Student("Reddy","Kalyan",30959);
//		  Student retrievedStudent = stuDao.getStudentById(s1.getId());
//      retrievedStudent.setFirstName("R");
//      stuDao.updateStudent(retrievedStudent);
//      System.out.println("Update success");
//	}

//	private void deleteStudent(StudentDAO stuDao) {
//      stuDao.deleteStudent(123);
//      System.out.println("Delete success");
//	}

}
