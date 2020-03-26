/*
Project: Car Dealership Team 6
Purpose Details: A Application to manage a car dealership and customers buying cars.
Course: IST242
Author: Tom Fadelsak, William Perez, Amal Sabirov, Liliya Sadykova
Date Developed: 3/12/20
Last Date Changed:
Revision: 0
*/
package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
//test
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