package com.JFSD.SringJDBCDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDAOClass implements StudentDAO {

	JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void insertStudents(Student_Details stu) {
		// TODO Auto-generated method
		String query = "insert into Student_Details values('"+stu.getSid()+"','"+stu.getSname()+"','"+stu.getCgpa()+"')";
		jt.update(query);
	}

	@Override
	public void deleteStudents(Student_Details stu) {
	    String query="delete from Student_Details where sid='"+stu.getSid()+"' ";  
		jt.update(query);	
		
	}

	@Override
	public void updateStudents(Student_Details stu) {
		String query = "update Student_Details set sname = '"+stu.getSname()+"' where sid = '"+stu.getSid()+"'";
		jt.update(query);		
		
	}

	@Override
	public Student_Details findStudents(int sid) {
		String query = "select * from Student_Details where sid = ?";
        Student_Details st = jt.queryForObject(query, new Object[]{sid}, new StudentMapper());
        return st;
		
	}

	@Override
	public List<Student_Details> getStudents() {
		String query = "SELECT * FROM Student_Details";
        return jt.query(query, new BeanPropertyRowMapper<>(Student_Details.class));
	}

}
