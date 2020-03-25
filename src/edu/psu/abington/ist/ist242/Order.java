package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Order{
    int orderID;
    String Date;
    Double orderTotal;
    private ArrayList<Order>orders;


    public Order(int orderID, String date, Double orderTotal) {

    }

    public void setNewOrder(int orderID, String date, Double orderTotal){
        this.orderID = orderID;
        this.Date = date;
        this.orderTotal = orderTotal;
    }

    public int getOrderID(){
        return orderID;

    }
    public String getDate(){
        return Date;
    }
    public double orderTotal(){
        return orderTotal;
    }
}