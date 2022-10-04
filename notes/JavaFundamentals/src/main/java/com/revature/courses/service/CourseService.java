package com.revature.courses.service;

import com.revature.courses.dao.CourseDAO;
import com.revature.courses.dao.CourseDAOImpl;

import java.util.Scanner;

public class CourseService {

    Scanner sc = new Scanner(System.in);

    CourseDAO cd = new CourseDAOImpl();
    public void createCourse(){
        System.out.println("Enter Course Number");
        String courseNum = sc.nextLine();

        System.out.println("enter course title: ");
        String courseName = sc.nextLine();

        System.out.println("enter teacher id");
        int teacherId = Integer.parseInt(sc.nextLine());

        cd.createCourse(courseNum,courseName,teacherId);
    }


}
