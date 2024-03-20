package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLUpdate {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		 String X = "update Student set stu_name=:n where stu_id=:i";

		    Query q = s.createQuery(X);
		    q.setParameter("i",30976);
		    q.setParameter("n","Pathan Faizaan");

		    q.executeUpdate();
		    
		    System.out.println("updated");
		
		
	}

}
