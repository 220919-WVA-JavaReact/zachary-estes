package com.revature.strings;


public class StringDriver {
    /*
    Strings can also be created like so
     */
    public static void main(String[] args) {

        String text2 = new String("this is also a string");

        //let's try to add strings together
        String helloWorld = "Hello";
        helloWorld += " world";
        System.out.println(helloWorld);

        //comparing strings
        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";

        // when working with objects we see that the == operator actually checks the objects to see if they're the same
        // object in memory, it does not check the explicit value but the "address" of the data

        // so how do we check for equality of values? What we need to call is the .equals() method from the Object class,
        //which all classes inherit from, but it essentially allows is the ability to check the equality of values

        // this idea of using the .equals for objects is very important and we'll discuss it later again when looking at
        // inheritance and polymorphism

        // == compares the reference in memory, .equals compares the value of string

        //trying to find the strings length

        String newString = "this is a new string";
        System.out.println(newString.length());

        System.out.println(isEven(newString));

        //what happens if we wanted to repeat strings so many times

        newString.repeat(2);

        System.out.println(newString.repeat(2));

        //im going to call repeat method
        System.out.println(repeatSpace(newString, 5));
    }

    public static String addOn (String text){
        return text + " adding onto the end.";
    }

    //lets check is the length is even

    public static boolean isEven(String text) {

        int len = text.length();

        if (len % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // lets create a quick method for repeating strings with a space in a middle

    public static String repeatSpace(String text, int count){
        // for loop
        String newText = "";
        int i;
        for ( i=0; i<count; i++){
            newText += text;
            newText += " ";
        }
        return newText;
    }
}
