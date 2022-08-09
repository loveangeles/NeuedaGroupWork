package com.example.financialapplication.persons;

//Raise an Error in IDE if designated person is not found
public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(Long pid) {
        super("Could not find person " + pid);
    }
}
