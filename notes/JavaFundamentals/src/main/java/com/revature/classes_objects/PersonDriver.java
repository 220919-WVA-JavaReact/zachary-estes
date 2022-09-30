package com.revature.classes_objects;

public class PersonDriver {

    /*
    I'm going to use the m,ain method in this PersonDriver class to call upon my  Person class and create person objects
     */
    //start main method
    public static void main(String[] args) {
        // any logic we write here will be the logic done when we run the program

        // Declare a primitive value
        int num = 9;

        // declaring an object is slightly different
        Person zach  = new Person( "Zach", 72.5,175.5,22);

        System.out.println(zach.height);

        System.out.println(zach.name);

        Person joseph = new Person("joseph",62.75,90,45);

        System.out.println(joseph.height);

        zach.walk(500);

        System.out.println(zach.talk());

        Person jimmy = new Person();

        System.out.println(jimmy.weight);

        Person kyle = new Person("Kyle");

        System.out.println(jimmy.name);

        System.out.println(kyle.name);

        // We can reassign the variables given in this case
        jimmy.name = "Jimmy";

        System.out.println(jimmy.name);
    }
}
