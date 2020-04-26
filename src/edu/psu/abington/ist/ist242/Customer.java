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

        /**
         * This is the customer users using the application.
         *
         * @param int userID            A integer that is incrementally generated for each user of the application to uniquely identify them.
         * @param String userName       The stored/saved username for each customer that is checked for auth at the beginning of the application.
         * @param String passWord       The stored/saved password for each customer that is checked for auth at the beginning of the application.
         * @param String Address        The stored/saved address for each customer.
         * @param String eMail          The stored/saved email address for each customer.
         * @param int creditScore       The stored/saved credit score for each customer using this application
         * @author
         * @version                     1.0
         * @since                       <pre>Apr 26, 2020</pre>
         */
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

    public void deleteCustomer(ArrayList<Customer> customerList) {
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
            System.out.println("Customer Score:" + cust.getCreditScore());
            System.out.println();
        }
    }
    public static boolean checkPassword(String username, String password, ArrayList<Customer> customerList) {

        /**
         * This checks the password and username that the Customer inputs when they are logging in.
         *
         * @param String userName            The stored/saved username for each Customer that is checked for auth at the beginning of the application.
         * @param String passWord            The stored/saved password for each Customer that is checked for auth at the beginning of the application.
         * @param ArrayList Customer         The stored/saved Customers inside the application.
         * @author
         * @version                          1.0
         * @since                            <pre>Apr 26, 2020</pre>
         */

        boolean found = false;
        for (Customer cust : customerList) {
            if (cust.userName.equals(username) && cust.passWord.equals(password)) {
                found = true;
                System.out.println(cust.userID);
                break;
            }
        }
        return found;
    }
}
