package com.example.sbformdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerDAOClass implements EmployerDAO {

	EmployerRepository er;
	@Autowired
	public EmployerDAOClass(EmployerRepository er) {
		super();
		this.er = er;
	}

	@Override
	public void insertStudent(Employer emp) {
		// TODO Auto-generated method stub
		er.save(emp);
		
	}

}
