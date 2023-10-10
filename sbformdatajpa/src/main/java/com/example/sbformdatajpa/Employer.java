package com.example.sbformdatajpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_det")
public class Employer {
	
	@Id
	@Column(name="eid")
	private int id;

	@Column(name="emp_name")
	private String name;
	@Column(name="emp_mail")
	private String email;
	
	public Employer() {
		
	}
	
	public Employer(int id,String name, String email) {
		this.id=id;
		this.name = name;
		this.email=email;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
