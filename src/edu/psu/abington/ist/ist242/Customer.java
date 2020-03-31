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
import java.util.Scanner;

public class Customer extends User {
    int creditScore;

    private ArrayList <Customer> customerList = new ArrayList<>();


    public Customer(int userID, String userName, String passWord, String eMail, String Address, int creditScore) {
        super(userID, userName, passWord, eMail, Address);
        this.creditScore = creditScore;
    }

    public void addCustomer(Customer customer)
    {
        customerList.add(customer);
    }

    public void deleteCustomer(Customer customer)
    {
        customerList.remove(customer);
    }

    public void editCustomer(Customer customer)
    {


    }
}
