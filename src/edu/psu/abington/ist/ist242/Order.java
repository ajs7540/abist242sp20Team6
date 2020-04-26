/*
Project: Car Dealership Team 6
Purpose Details: A Application to manage a car dealership and customers buying cars.
Course: IST242
Author: Tom Fadelsak, William Perez, Amal Sabirov, Liliya Sadykova
Date Developed: 3/12/20
Last Date Changed: 4/7
Revision: 0
*/
package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Order{

    /**
     * Order has a date and a car with a total.
     *
     * @param int orderID              A integer that is incrementally generated for each car of the application to uniquely identify them.
     * @param String date              using date.java to format date properly and marking the date of the order
     * @param Double double            A double for the order total price
     * @param Car Car                  A car object to attach the current car to the order
     *
     * @author                         Team 6
     * @version                        1.0
     * @since                          <pre>Apr 26, 2020</pre>
     */

    static int orderID;
    String date;
    Double orderTotal;
    Car car;


    public Order(String date, Car car) {
        this.orderID++;
        this.date = date;
        this.orderTotal = (car.sellingPrice * 1.08);  //Calc tax on creation
        this.car = car;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", orderTotal=$" + String.format("%.2f", orderTotal) + //Print total to two dec places
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