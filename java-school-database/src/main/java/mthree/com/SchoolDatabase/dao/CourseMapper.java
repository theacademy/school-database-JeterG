package mthree.com.SchoolDatabase.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mthree.com.SchoolDatabase.model.Course;

public class CourseMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet rs, int index) throws SQLException {
        Course course = new Course();
        course.setCourseCode(rs.getString("COURSECODE"));
        course.setCourseDesc(rs.getString("COURSEDESC"));
        return course;
    }
}
