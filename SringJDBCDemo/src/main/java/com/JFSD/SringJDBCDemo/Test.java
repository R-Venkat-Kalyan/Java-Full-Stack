package com.JFSD.SringJDBCDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		StudentDAO dao = (StudentDAO) ac.getBean("studao");
		
//		insert
//        Student_Details st = new Student_Details();
//        st.setSid(30976);
//        st.setSname("faizaan");
//        st.setCgpa(9.48);
//        dao.insertStudents(st);

//		updating name of id 30976
//		Student_Details st = new Student_Details();
//        st.setSid(30976);
//        st.setSname("faizaan azam");
//		dao.updateStudents(st);
		
//		delete
//		deleting the record with id =  30976
//		Student_Details st = new Student_Details();
//		st.setSid(30976);
//		dao.deleteStudents(st);
		
		
//		find single record
		Student_Details st = new Student_Details();
		st = dao.findStudents(30959);
		System.out.println(st.getSname()+" "+st.getCgpa());
		
//		find all records
//		List<Student_Details> l = dao.getStudents();
//		for(Student_Details y : l){
//			System.out.println(y.getSid()+" "+y.getSname()+" "+y.getCgpa());
//		}		        
	}

}
