package com.JFSD.hibernateExamples;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import java.util.*;

public class HCQLRetstriction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria cr = s.createCriteria(Student.class);
		cr.add(Restrictions.ge("id", 30975));
		List<Student> ll = cr.list();
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			Student std = (Student)itr.next();
			System.out.println(std.getId());
		}
		
	}

}
