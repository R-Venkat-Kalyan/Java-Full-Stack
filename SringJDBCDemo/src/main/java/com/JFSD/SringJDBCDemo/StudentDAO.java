package com.JFSD.SringJDBCDemo;

import java.util.List;


public interface StudentDAO {

	public void insertStudents(Student_Details stu);
	public void deleteStudents(Student_Details stu);
	public void updateStudents(Student_Details stu);
	public Student_Details findStudents(int sid);
	public List<Student_Details> getStudents();	
}
