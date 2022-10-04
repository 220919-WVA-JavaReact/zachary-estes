package com.revature.courses.dao;

import com.revature.courses.models.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TeacherDAOImpl implements TeacherDAO{


    @Override
    public Teacher getByUsername(String username) {

        String line = " ";
        String splitBy = ",";
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/teachers.csv"));

            // This is allowing us to read through the entire file till the end
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                // This is where we'll do our logic

                String[] info = line.split(splitBy);

                if (info[3].equals(username)){
                    return new Teacher(info[1], info[2], info[3], info[4]);
                }

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}