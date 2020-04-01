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

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<SalesPerson> salesTeam = new ArrayList<>();

        Customer cust1 = new Customer(1, "john", "john1", "john@email.com", "1 some street, PA", 700);
        Customer cust2 = new Customer(2, "anna", "anna1", "anna@email.com", "2 some street, PA", 701);
        Customer cust3 = new Customer(3, "pete", "pete1", "pete@email.com", "3 some street, PA", 702);
        Customer cust4 = new Customer(4, "sarah", "sarah1", "sarah@email.com", "4 some street, PA", 703);
        Customer cust5 = new Customer(5, "mat", "mat1", "mat@email.com", "5 some street, PA", 704);

        cust1.addCustomer(customerList);
        cust2.addCustomer(customerList);
        cust3.addCustomer(customerList);
        cust4.addCustomer(customerList);
        cust5.addCustomer(customerList);

        SalesPerson sp1 = new SalesPerson(1, "kate", "kate1", "kate@email.com", "1 other street, PA");
        SalesPerson sp2 = new SalesPerson(2, "sam", "sam1", "sam@email.com", "2 other street, PA");
        SalesPerson sp3 = new SalesPerson(3, "emma", "emma1", "emma@email.com", "3 other street, PA");
        SalesPerson sp4 = new SalesPerson(4, "max", "max1", "max@email.com", "4 other street, PA");
        SalesPerson sp5 = new SalesPerson(5, "ari", "ari1", "ari@email.com", "5 other street, PA");

        sp1.addSalesPerson(salesTeam);
        sp2.addSalesPerson(salesTeam);
        sp3.addSalesPerson(salesTeam);
        sp4.addSalesPerson(salesTeam);
        sp5.addSalesPerson(salesTeam);


        System.out.println("Welcome to Car Dealership Program!");
        System.out.println("Please select from the following options:");

        System.out.println("Enter 1 to Login");
        System.out.println("Enter q to Quit");
        int a = Menu.callmenu(1);
        if (a == 1) {
            int i = login (customerList, salesTeam);
                if (i ==1)
                {
                    System.out.println("Customer menu:");
                }
            else if (i == 2)
            {
                System.out.println("Sales person menu:");
            }
            else
                {
                    System.out.println("You are not logged in.");
                }
                    System.out.println("Enter 1 to view current cars in car inventory");
                    System.out.println("Enter 2 to do option 2");
                    System.out.println("Enter 3 to do option 3");
                    System.out.println("Enter 4 to do option 4");
                    System.out.println("Enter q to Quit");
                    int b = Menu.callmenu(4);
                    if (b == 1) {
                        //This is option 1
                        System.out.print("Option: " + b);
                    } else if (b == 2) {
                        //This is option 2
                        System.out.print("Option: " + b);
                    } else if (b == 3) {
                        //This is option 3
                        System.out.print("Option: " + b);
                    } else if (b == 4) {
                        //This is option 4
                        System.out.print("Option: " + b);
                    }
                }
        }


    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toLowerCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public static int login(ArrayList<Customer> cList, ArrayList<SalesPerson> sTeam) {
        String username;
        String password;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i >= 0 ; i--) {
            System.out.println("Please login");

            System.out.println("Username: ");
            username = sc.nextLine();

            System.out.println("Password: ");
            password = sc.nextLine();

            if (Customer.checkPassword(username, password, cList))
            {
                j = 1;
                break;
            } else if (SalesPerson.checkPassword(username, password, sTeam))
            {
                j = 2;
                break;
            } else {
                System.out.println("The username and password you entered are incorrect.\nYou have " + i + " more attempts until program quits.");
            }
        }
        return j;
    }

}