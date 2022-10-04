package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.models.Teacher;

public class TeacherService {

    TeacherDAO td = new TeacherDAOImpl();

    public void login(String username, String password){

        Teacher teach = td.getByUsername(username);

        if(teach.getPassword().equals(password)){
            System.out.println("Congrats you are logged in");
            System.out.println(teach);
        } else{
            System.out.println("invalid login");
        }
    }
}
