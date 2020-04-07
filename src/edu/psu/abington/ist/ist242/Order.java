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
    static int orderID;
    String date;
    Double orderTotal;
    Car car;


    public Order(String date, Car car) {
        this.orderID++;
        this.date = date;
        this.orderTotal = (car.sellingPrice * 1.08);
        this.car = car;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", orderTotal=$" + String.format("%.2f", orderTotal) +
                ", car=" + car +
                '}';
    }

    public static void printOrders(ArrayList<Order> orders){
        for(Order order : orders){
            System.out.println(order.toString());
        }
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getOrderID(){
        return orderID;

    }
    public String getDate(){

        return date;
    }
    public double orderTotal(){

        return orderTotal;
    }
}