package com.example.financialapplication.persons;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cash {

    @Id
    @GeneratedValue
    private long cashid;
    private long pid;
    private String date;
    private float amount;
    private String actiontype;

    public long getCashid() {
        return cashid;
    }

    public void setCashid(long cashid) {
        this.cashid = cashid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }
}
