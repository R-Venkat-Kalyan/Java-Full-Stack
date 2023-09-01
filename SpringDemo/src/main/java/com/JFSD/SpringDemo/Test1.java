package com.JFSD.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
	
	public static void main(String args[]) {
		
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spconfig.xml");
		Object ob = ac.getBean("empBean");
		Employee e = (Employee) ob;
		System.out.println(e.geteId());
	}

}
