package com.example.financialapplication.persons;

import javax.persistence.*;

@Entity
public class Stocks {

    //Define required initial variables for Stocks
    @Id
    private long stockid;
    private long pid;
    private float amount;
    private float price;
    private String date;
    private String stockcode;
    private String actiontype;


    //Stocks Getter and Setter
    public long getStockid() {
        return stockid;
    }

    public void setStockid(long stockid) {
        this.stockid = stockid;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }
}
