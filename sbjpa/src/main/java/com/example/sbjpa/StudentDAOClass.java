package com.example.sbjpa;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentDAOClass implements StudentDAO {
	
	EntityManager em;
	@Autowired
	public StudentDAOClass(EntityManager em) {
		this.em = em;
	}

	@Override
	@Transactional
	public void insertStudent(Student stu) {
		// TODO Auto-generated method stub
		em.persist(stu);
		
	}
	
	 @Override
	 @Transactional
	    public Student getStudentById(int studentId) {
	        return em.find(Student.class, studentId);
	    }

	    @Override
	    @Transactional
	    public void updateStudent(Student student) {
	        em.merge(student);
	    }

	    @Override
	    @Transactional
	    public void deleteStudent(int studentId) {
	        Student student = em.find(Student.class, studentId);
	        if (student != null) {
	            em.remove(student);
	        }
	    }

}
