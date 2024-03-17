package com.JFSD.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Card c = new Card();
		Cheque cq = new Cheque();
		
//		p.setPid(101);
//		p.setAmount(10002);
		
		c.setAmount(100000);
		c.setCardType("visa");
		c.setPid(111);

		cq.setAmount(19090);
		cq.setChequeType("Business");
		cq.setPid(1234);
		
		s.save(c);
		s.save(cq);
//		s.persist(c);
//		s.persist(cq);
		
		
		System.out.println("success");
	}

}
