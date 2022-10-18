package com.revature.exercises;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetExercises {
    /*
    Below is a list of exercises to help you get familiar with working with the HashSet Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter the item you wish to change");
        String x = sc.nextLine();

        System.out.println("enter the changed item");
        String y = sc.nextLine();

        colors.remove(x);
        colors.add(y);

        System.out.println(y + " has been added to this hashset");

        // 2. Write a Java program to iterate through all elements in a hash list.
        for (String a : colors){
            System.out.println(a);
        }

        // 3. Write a Java program to get the number of elements in a hash set
        System.out.println(colors.size());


        // 4. Write a Java program to test a hash set is empty or not
        if (colors.size() > 0){
            System.out.println("This hashset is not empty");
        }else{
            System.out.println("this hashset is empty");
        }


        // 5. Write a Java program to convert a hash set to an array.
        Object[] c = colors.toArray();
        System.out.println(Arrays.toString(c));
    }
}
