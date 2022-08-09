package com.example.financialapplication.persons;

import javax.persistence.*;
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long pid;
    private String name;

}
