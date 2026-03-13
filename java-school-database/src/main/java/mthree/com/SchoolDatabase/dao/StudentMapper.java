package mthree.com.SchoolDatabase.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mthree.com.SchoolDatabase.model.Student;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int index) throws SQLException {
        Student student = new Student();
        student.setStudentFName(rs.getString("FNAME"));
        student.setStudentLName(rs.getString("LNAME"));
        return student;
    }
}
