package com.revature.testing;

public class DivideByZeroException extends RuntimeException{

    public DivideByZeroException(String errorMessage){
        super(errorMessage);
    }
}
