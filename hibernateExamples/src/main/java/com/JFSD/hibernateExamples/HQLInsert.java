package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLInsert {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String query = "insert into Student(id,name) values(30959,'kalyan')";
		Query q = s.createQuery(query);
		q.executeUpdate();
		System.out.println("Successfull");
	}

}
