package com.revature.courses;

import com.revature.courses.models.Teacher;

import java.util.Scanner;

public class App {

    // Inside od my app class is all of the information and logic to start and run the application
    // Menu logic should be here and this should call upon

    public static void main(String[] args) {

//        Teacher teach = new Teacher(1, "Zach", "Estes", "zestes", "password" );
//
//        String teacher = teach.toString();
//        System.out.println(teacher);
//
//        System.out.println(teach);

        System.out.println("Press 1 to login. Press 2 to to register");

        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();


        if(choice.equals("1")){
            // this is where we get login credentials
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();

            System.out.println("Username" + username + "Password" + password);
        } else if (choice.equals("2")){
            System.out.println("Please enter your first name");
            String first = sc.nextLine();
            System.out.println("Please enter your last name");
            String last = sc.nextLine();
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();

            System.out.println("Username" + username + "Password" + password);
        }
    }
}
