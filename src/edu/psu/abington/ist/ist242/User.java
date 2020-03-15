package edu.psu.abington.ist.ist242;

import java.util.Scanner;

public class User {
    private int userID = 1;
    private String userName;
    private String Address;
    private String eMail;
    private String passWord;
    Boolean isSalesman;
    int creditScore;

    public addUser(int userID, String userName, String passWord,
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
