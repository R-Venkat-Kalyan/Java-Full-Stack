package com.JFSD.hibernateExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;

public class RetriveSpecificRecords {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String query = "select id,name from Student";
		Query q = s.createQuery(query);
		
		List<Student> ll = q.list();
		Iterator itr = ll.iterator();
		
//		To retrive single column
//		while(itr.hasNext()) {
//			Object ob = (Object)itr.next();
//			System.out.println(ob);
//			
//		}
		
//		To retrive multiple column
		while(itr.hasNext()) {
			Object ob[] = (Object[])itr.next();
			System.out.println(ob[0]+" "+ob[1]);
			
		}
		
		
		
		

	}

}
