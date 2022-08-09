package com.example.financialapplication.persons;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    private long pid;
    private String first_name;
    private String last_name;

    //Match more same type info for same person
    @OneToMany(mappedBy = "pid",cascade = CascadeType.ALL)
    private List<Bonds> bonds;
    @OneToMany(mappedBy = "pid",cascade = CascadeType.ALL)
    private List<Cash> cash;
    @OneToMany(mappedBy = "pid",cascade = CascadeType.ALL)
    private List<Stocks> stocks;

    //Person Constructor
    public Person() {
    }

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    //Person Getter and Setter
    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Bonds> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bonds> bonds) {
        this.bonds = bonds;
    }

    public List<Cash> getCash() {
        return cash;
    }

    public void setCash(List<Cash> cash) {
        this.cash = cash;
    }

    public List<Stocks> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stocks> stocks) {
        this.stocks = stocks;
    }
}
