//Joe 1
package edu.psu.abington.ist.ist242;
// Liliya
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    int creditScore;

    ArrayList<Customer> CustomerList = new ArrayList<>();


    public Customer(int userID, String userName, String passWord, String eMail, String Address, int creditScore) {
        super(userID, userName, passWord, eMail, Address);
        this.creditScore = creditScore;
    }

    public void addCustomer(int userID, String userName, String passWord, String eMail, String Address, int creditScore)
    {
        new Customer(userID, userName, passWord, eMail, Address, creditScore);
    }

    public void deleteCustomer(int userID)
    {

    }

    public void editCustomer(int userID)
    {

    }
}
