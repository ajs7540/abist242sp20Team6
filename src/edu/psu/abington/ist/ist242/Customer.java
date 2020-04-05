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

    public Customer(int userID, String userName, String passWord, String eMail, String Address, int creditScore) {
        super(userID, userName, passWord, eMail, Address);
        this.creditScore = creditScore;
    }

    public void addCustomer(ArrayList<Customer> customerList)
    {
        customerList.add(this);
    }

    public void deleteCustomer(ArrayList<Customer> customerList)
    {
        customerList.remove(this);
    }

    public int getCreditScore()
    {
        return creditScore;
    }

    public static void printCustomers(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getID());
            System.out.println("Customer Name:" + cust.getName());
            System.out.println("Customer Email:" + cust.geteMail());
            System.out.println("Customer Address:" + cust.getAddress());
        }
    }
    public static boolean checkPassword(String username, String password, ArrayList<Customer> customerList) {
        boolean found = false;
        for (Customer cust : customerList) {
            if (cust.userName.equals(username) && cust.passWord.equals(password)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
