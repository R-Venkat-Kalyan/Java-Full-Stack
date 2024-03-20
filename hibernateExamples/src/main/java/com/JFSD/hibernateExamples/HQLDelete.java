package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLDelete {

	public static void main(String[] args) {
	    
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String query = "delete from Student where id = 31090";
		Query q = s.createQuery(query);
		q.executeUpdate();
		System.out.println("deletion success");

	}

}
