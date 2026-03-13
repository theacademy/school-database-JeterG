package mthree.com.SchoolDatabase.dao;

import java.util.List;

import mthree.com.SchoolDatabase.model.Course;
import mthree.com.SchoolDatabase.model.Student;
import mthree.com.SchoolDatabase.model.StudentClassCount;
import mthree.com.SchoolDatabase.model.Teacher;
import mthree.com.SchoolDatabase.model.TeacherCount;

public interface SchoolDao {
    List<Student> allStudents();

    List<Student> studentsCS148();

    List<Course> csCourses();

    List<TeacherCount> teacherCountByDept();

    List<StudentClassCount> studentsPerClass();

    List<Teacher> listAllTeachers();

    void addStudent();

    void addStudentToClass();

    void editCourseDescription();

    void deleteTeacher();
}
