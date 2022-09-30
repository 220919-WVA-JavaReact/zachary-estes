package com.revature.classes_objects;

// the first uncommented line of java files should be the package name
// packages provide useful namespaces for us to declare similar classes with the correct name

public class Person {
    /*
    this is a multi-line comment

    we talked about classes and objects yesterday and said classes are blueprints for objects

    we can create classes  as blueprints with all the necessary info we expect every object from that class to get

    first thing i'll create are fields which are similar to properties of the object. we create these just like
    regular variables from yesterday only we don't necessarily have to give them a value
     */

    String name;

    double height;

    double weight;

    int age;

    /*
    everytime I create a person object they should have all these properties associated with them and depending on
    how the variable is accessible I should be able to call the value by saying something like personObject.field
     */

    // Constructors are basically special method with the same name as the class itself and provides a simple way
    // to set the STATE of the object upon creation (instantiation)

    //creating method
    public Person (String name, double height, double weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }



    /*
    methods are like reusable chunks of code and they generally represent what an object can DO
    */

    //no args constructor
    public Person(){
        this.name = "James";
        this.height = 75;
        this.weight = 225;
        this.age = 26;
    }

    // 1 args constructor
    public Person(String name){
        this.name = name;
        this.height = 75;
        this.weight = 225;
        this.age = 26;
    }

    public void walk(int distance){
        System.out.println(this.name + " walked a distance of " + distance + " feet");
    }

    //

    public String talk(){
        return "Hi, my name is " + this.name;
    }
}
