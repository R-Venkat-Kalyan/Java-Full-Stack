package com.JFSD.hibernateExamples;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HCQLRetrive {
	
	public static void main(String[] args) {
	    
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria cr = s.createCriteria(Student.class);
		List<Student> ll = cr.list();
//		using Iterator to retrive
//		Iterator itr = ll.iterator();
//		while(itr.hasNext()) {
//			Student std = (Student)itr.next();
//			System.out.println(std.getId()+" "+std.getName());
//		}
		
//		using foreach to retrive
		for(Student s1:ll) {
			System.out.println(s1.getId()+" "+s1.getName());
		}
	}

}
