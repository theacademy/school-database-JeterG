package mthree.com.SchoolDatabase.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mthree.com.SchoolDatabase.model.TeacherCount;

public class TeacherCountMapper implements RowMapper<TeacherCount> {

    @Override
    public TeacherCount mapRow(ResultSet rs, int rowNum) throws SQLException {
        TeacherCount teacherCount = new TeacherCount();
        teacherCount.setDept(rs.getString("dept"));
        teacherCount.setCount(rs.getInt("teacherCount"));
        return teacherCount;
    }
}
