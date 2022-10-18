package com.revature.testing;

public class Calculator {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subNumbers(int a, int b){
        return a - b;
    }

    public double multNumbers(double a, double b){
        return a * b;
    }

    public double divNumbers(double a, double b){
        if( b == 0){
            throw new DivideByZeroException("You cannot divide by zero");
        }else{
            return a/b;
        }
    }



}
