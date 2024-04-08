package com.MyJUnitTesting.UnitTesting.Expection;

public class DeveloperNotFound extends RuntimeException{
    public DeveloperNotFound(String message) {
        super(message);
    }
}
