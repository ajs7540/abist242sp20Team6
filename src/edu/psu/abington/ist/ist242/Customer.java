package edu.psu.abington.ist.ist242;

import java.util.Scanner;

public class Customer extends User {
    int creditScore;

    public Customer(int userID, String userName, String passWord, String eMail, String Address, int creditScore, boolean isSalesman, String username, String password) {
        super(userID, userName, passWord, eMail, Address, username, password);
        this.creditScore = creditScore;
    }
}
