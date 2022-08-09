package com.example.financialapplication.persons;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    //@GeneratedValue
    private long pid;
    private String first_name;
    private String last_name;

    @OneToOne(cascade = CascadeType.ALL)
    private Bonds bonds;
    @OneToMany(mappedBy = "pid",cascade = CascadeType.ALL)
    private Set<Cash> cash;
    @OneToOne(cascade = CascadeType.ALL)
    private Stocks stocks;

    public Person() {
    }

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

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

    public Bonds getBonds() {
        return bonds;
    }

    public void setBonds(Bonds bonds) {
        this.bonds = bonds;
    }

    public Set<Cash> getCash() {
        return cash;
    }

    public void setCash(Set<Cash> cash) {
        this.cash = cash;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
