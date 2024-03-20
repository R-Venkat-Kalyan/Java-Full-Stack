package com.JFSD.hibernateExamples;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLRetriveAll {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String query = "from Student";
		Query q = s.createQuery(query);
		List<Student> ll = q.list();
		
//		Retriving using ForEach loop
//		for(Student s1: ll)
//			System.out.println(s1.getId()+" "+s1.getName());

//		Retriving using iterator
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			Student stu = (Student)itr.next();
			System.out.println(stu.getId()+" "+stu.getName());
			
		}
//		sf.close();
//		s.close();
//		t.commit();
	}

}
