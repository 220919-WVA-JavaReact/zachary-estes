package com.revature.excercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExercise {
    /*
    Below is a list of exercises to help you get familiar with working with the ArrayList Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Hello");
        list1.add("World");
        list1.add("Hello");
        list1.add("World");
        System.out.println(list1);


        // 2. Write a Java program to iterate through all elements in an array list

        Iterator<String> list2 = list1.iterator();
        while (list2.hasNext()){
            String x = list2.next();
            System.out.println(x);
        }

        // 3. Write a Java program to insert an element into the array list at the first position
        list1.add(0, "hi");
        System.out.println(list1);


        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an index");
        int res = sc.nextInt();
        String y = list1.get(res);
        System.out.println(y);

        // 5. Write a Java program to remove the third element from an array list.
        System.out.println(list1);
        list1.remove(2);
        System.out.println("removed the third index");
        System.out.println(list1);


        // 6. Write a Java program to search an element in an array list.
        System.out.println("enter an element");
        String res2 = sc.nextLine();
        for (String ele : list1){
            if (ele.contains(res2)){
                System.out.println("You found: " + res2);
            }
        }

        // 7. Write a Java program to sort a given array list.
        Collections.sort(list1);
        for (String h : list1){
            System.out.println(h);
        }
    }
}
