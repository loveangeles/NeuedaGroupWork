package com.example.financialapplication.persons;


import javax.persistence.*;

@Entity
public class Bonds {
    //Define required initial variables for Bonds
    @Id
    private long bondid;
    private long pid;
    private float amount;
    private float bondrate;
    private float bondprice;
    private String bondtype;
    private String actiontype;
    private String bondcode;
    private String date;


    //Bonds Getter and Setter
    public long getBondid() {
        return bondid;
    }

    public void setBondid(long bondid) {
        this.bondid = bondid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getBondrate() {
        return bondrate;
    }

    public void setBondrate(float bondrate) {
        this.bondrate = bondrate;
    }

    public float getBondprice() {
        return bondprice;
    }

    public void setBondprice(float bondprice) {
        this.bondprice = bondprice;
    }

    public String getBondtype() {
        return bondtype;
    }

    public void setBondtype(String bondtype) {
        this.bondtype = bondtype;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }

    public String getBondcode() {
        return bondcode;
    }

    public void setBondcode(String bondcode) {
        this.bondcode = bondcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

