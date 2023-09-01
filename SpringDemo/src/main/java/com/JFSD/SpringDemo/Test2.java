package com.JFSD.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spconfig.xml");
		Object ob = ac.getBean("empBean");
		Employee e = (Employee) ob;
		System.out.println("ID is "+e.geteId());
	}

}
