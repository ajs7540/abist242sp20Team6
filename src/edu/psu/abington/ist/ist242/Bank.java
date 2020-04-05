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
import java.util.Scanner;

public class Bank extends Customer {
    int bankID;
    int cScore;

    /*public Bank(int userID, String userName, String passWord, String eMail, String Address, int creditScore) {
        super(userID, userName, passWord, eMail, Address, creditScore);
    }*/

    public int getbankID() {
        return bankID;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public void checkcScore() { //customer class needs customers
        if (Customer.creditScore >= 650 && Customer.creditScore <= 850) {
            //Customer approved
        }
        else if (Customer.creditScore < 650) {
            //Customer denied
        }
    }
}
