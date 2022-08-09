package com.example.financialapplication.persons;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(Long pid) {
        super("Could not find person " + pid);
    }
}
