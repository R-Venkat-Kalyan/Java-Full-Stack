package com.example.sbjpa;

public interface StudentDAO {

	public void insertStudent(Student stu);
	public Student getStudentById(int studentId);
	public void updateStudent(Student student);
	public void deleteStudent(int studentId);
	
}
