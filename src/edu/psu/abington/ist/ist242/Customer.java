package edu.psu.abington.ist.ist242;

import java.util.Scanner;

public class Customer {
    public int userID = 1;
    public String userName;
    public String Address;
    public String eMail;
    public String passWord;
    Boolean isSalesman;
    int creditScore;

    public User(int userID, String userName, String passWord,
                String eMail, String Address, int creditScore,
                boolean isSalesman)
    {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.Address = Address;
        this.creditScore = creditScore;
        this.isSalesman = isSalesman;
    }



}
