package com.example.financialapplication.persons;
import javax.persistence.*;

@Entity
public class Cash {

    //Define required initial variables for Bonds
    @Id
    private long cashid;
    private long pid;
    private float amount;
    private String date;
    private String bankorg;
    private String actiontype;

    //Cash Getter and Setter
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBankorg() {
        return bankorg;
    }

    public void setBankorg(String bankorg) {
        this.bankorg = bankorg;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }
}
