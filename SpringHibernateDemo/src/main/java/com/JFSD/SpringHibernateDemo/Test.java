package com.JFSD.SpringHibernateDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		EmployeeDAO dao = (EmployeeDAO) ac.getBean("empdao");
		
//		insert
//		Employee e = new Employee();
//		e.setEid(30959);
//		e.setEname("kalyan");
//		e.setEsal(10000);
//		dao.insertEmployee(e);
		
		
		//update
//		Employee e1 = new Employee( );
//		e1.setEid(30976);
//		e1.setEname("faizaan");
//		e1.setEsal(30000.456);
//		dao.updateEmployee(e1);		
		
//		delete
//		deleting the record with id =  1000
//		Employee e1 = new Employee( );
//		e1.setEid(10000);
//		dao.deleteEmployee(e1);		
		
		
//		find single record(not working)
//		Employee e1 = new Employee();
//		e1 = dao.findEmployee(30959);
//		System.out.println(e1);
		
//		find all records
		List<Employee> l = dao.getEmployees( );
		for(Employee y : l){
			System.out.println(y.getEid( )+" "+y.getEname( )+" "+y.getEsal( ));
		}		
		
	}

}
