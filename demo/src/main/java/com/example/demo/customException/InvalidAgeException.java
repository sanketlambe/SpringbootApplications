package com.example.demo.customException;

public class InvalidAgeException extends Exception{
    public InvalidAgeException()
    {
        super("to Open Account Age should be greater than 18");

    }
}
