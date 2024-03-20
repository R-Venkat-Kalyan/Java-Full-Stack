package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;
public class RetriveSingleColumn {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String query = "select id from Student";
		Query q = s.createQuery(query);
		List<Student> ll = q.list();
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			Object ob = (Object)itr.next();
			System.out.println(ob);
			
		}

	}

}
