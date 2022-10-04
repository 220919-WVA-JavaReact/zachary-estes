package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public interface CourseDAO {
    Course createCourse(String courseNum, String title, int teacherId);

    List<Course> getAllCourse();

    List<Course> getCourseByTeacherId(int id);

    boolean assignCourse(Course course);
}
