package com.example.financialapplication.persons;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bonds {
    @Id
    //@GeneratedValue
    private long bondid;
    private long pid;
    private String date;
    private float amount;
    private String bondtype;
    private String actiontype;

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
}
