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

public class User {

    public int userID;
    public String userName;
    public String Address;
    public String eMail;
    public String passWord;

    public User(int userID, String userName, String passWord, String eMail, String Address)
    {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.Address = Address;

    }

    public int getID()
    {
        return userID;
    }

    public String getPassword()
    {
        return passWord;
    }

    public String getName()
    {
        return userName;

    }

    public String geteMail()
    {
        return eMail;
    }

    public String getAddress()
    {
        return Address;
    }
}
