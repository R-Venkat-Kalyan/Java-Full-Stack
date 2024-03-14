package com.JFSD.SringJDBCDemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student_Details> {

	@Override
	public Student_Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student_Details st = new Student_Details();
		st.setSid(rs.getInt("sid"));
		st.setSname(rs.getString("sname"));
		st.setCgpa(rs.getDouble("cgpa"));
		return st;
	}

}
