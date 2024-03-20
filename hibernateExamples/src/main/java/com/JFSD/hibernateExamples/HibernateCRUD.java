package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCRUD {
	
	public static void main(String args[]) {
		
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	
//	Insertion of records
//	Student stu = new Student();
//	stu.setId(30959);
//	stu.setName("kalyan");
//	stu.setId(31090);
//	stu.setName("sai");
	
//	Retrieval of records
//	Student stu = s.get(Student.class, 30959);
//	System.out.println(stu.getName());
//	s.save(stu);
	
//	updation of records
//	Student stu = s.get(Student.class, 30959);
//	stu.setName("venkat Kalyan");
//	s.save(stu);
//  System.out.println("Updated successfully");
	
//	Deletion of records
//	Student stu = s.get(Student.class, 30959);
//	s.delete(stu);
//	System.out.println("Deleted successfully");
	t.commit();
	s.close();
	sf.close();
//	All the crud opeartions are executed successfully in the above code
	
	}
}
