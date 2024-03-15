package com.JFSD.SpringHibernateDemo;

import java.util.List;

public interface EmployeeDAO {

	public void insertEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee findEmployee(int eid);
	public List<Employee> getEmployees();
}
