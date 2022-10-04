package com.revature.excercises;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExercises {
    /*
    Below is a list of exercises to help you get familiar with working with the ArrayList Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("Red");
        list3.add("Blue");
        list3.add("Green");
        list3.add("Orange");
        list3.add("Pink");
        list3.add("Purple");
        list3.add("Brown");

        list3.addLast("Violet");
        System.out.println(list3);
        // 2. Write a Java program to iterate through all elements in a linked list.

        Iterator<String> z = list3.iterator();
        while (z.hasNext()){
            String it2 = z.next();
            System.out.println(it2);
        }
        // 3. Write a Java program to iterate a linked list in reverse order
        Iterator<String> it3 = list3.descendingIterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        // 4.  Write a Java program to insert the specified element at the front of a linked list
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter an element");
//        String x1 = sc.nextLine();
//        list3.addFirst(x1);
//        System.out.println(list3);
        // 5. Write a Java program to insert some elements at the specified position into a linked list.

        String[] k = list3.toArray(new String[0]);
        String t = "";
        t = k[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an element");
        String x2 = sc.nextLine();
        System.out.println("enter an position");
        int x3 = sc.nextInt();

        for ( int i = 1; i < x3 - 1; i++){
            if( t != null){
                list3.addFirst(x2);
            }
        }

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

        // 7. Write a Java program to check if a particular element exists in a linked list.

        // 8. Write a Java program to convert a linked list to array list.


    }
}
