package com.revature.exercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercises {
    /*
    Below is a list of exercises to help you get familiar with working with the HashMap Collection
     */
    public static void main(String[] args) {

        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated
        HashMap<String, String> colors = new HashMap<String, String>();

        colors.put("Red", "Pink");
        colors.put("Blue", "Yellow");
        colors.put("Green", "White");
        colors.put("Orange", "Purple");
        colors.put("Black", "Teal");

        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println(colors.size());
        // 3. Write a Java program to test if a map contains a mapping for the specified key
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a key");
        String x = sc.nextLine();

        String y = colors.get(x);

        if ( y == null ){
            System.out.println("That key is not in this hashmap!");
        }else{
            System.out.println(x + " is in this hashmap! ");
        }

        // 4. Write a Java program to get the value of a specified key in a map.
        System.out.println("Find a key");
        String z = sc.nextLine();
        String a = colors.get(z);
        System.out.println(a);
        // 5. Write a Java program to get a set view of the keys contained in this map.
        for (String b : colors.keySet()){
            System.out.println("keys: " + b + " values: " + colors.get(b));
        }
    }
}
