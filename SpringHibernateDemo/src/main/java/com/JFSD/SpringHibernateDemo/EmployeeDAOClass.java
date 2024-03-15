package com.JFSD.SpringHibernateDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EmployeeDAOClass implements EmployeeDAO {

	HibernateTemplate ht;
	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		ht.save(emp);
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		ht.delete(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		ht.update(emp);
	}

	@Override
	public Employee findEmployee(int eid) {
		// TODO Auto-generated method stub
		Employee emp = ht.load(Employee.class,eid);
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> al = new ArrayList<>();
		al = ht.loadAll(Employee.class);
		return al;
	}

}
