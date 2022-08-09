package com.example.hrapplication.person;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String hobby;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Person(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }
}
