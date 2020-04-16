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

    public static Customer addNewCustomer(int id,  ArrayList<Customer> customerList)
    {
        Scanner scnr = new Scanner(System.in);
        String userName="", passWord="",  eMail="",  Address="";
        int creditScore =0;
        boolean found = false;

        System.out.println("Enter username: ");
        userName = scnr.nextLine();

        System.out.println("Enter password: ");
        passWord = scnr.nextLine();

        System.out.println("Enter email: ");
        eMail = scnr.nextLine();

        System.out.println("Enter address: ");
        Address = scnr.nextLine();

        System.out.println("Enter your credit score: ");
        creditScore = scnr.nextInt();

        Customer c1 = new Customer(id, userName,passWord,eMail,Address,creditScore);

        return c1;
    }

    public void deleteCustomer(ArrayList<Customer> customerList)
    {
        customerList.remove(this);
    }

    public int getCreditScore()
    {
        return creditScore;
    }
    public void setCustomerEmail(String eMail){
        this.eMail = eMail;

    }
    public void setCustomerAddress(String address){
        this.Address = address;
    }

    public static void printCustomers(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getID());
            System.out.println("Customer Name:" + cust.getName());
            System.out.println("Customer Email:" + cust.geteMail());
            System.out.println("Customer Address:" + cust.getAddress());
            System.out.println();
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
