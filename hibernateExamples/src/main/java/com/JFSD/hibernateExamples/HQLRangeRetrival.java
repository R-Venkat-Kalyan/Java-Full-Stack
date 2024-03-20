package com.JFSD.hibernateExamples;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLRangeRetrival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        String query = "from Student";
        Query que = s.createQuery(query);
        que.setFirstResult(0);
        que.setMaxResults(2);
        List<Student> ll = que.list();
        Iterator itr = ll.iterator();
        while(itr.hasNext()) {
        	Student s1 = (Student)itr.next();
        	System.out.println(s1.getId());
        }
        
	}

}
