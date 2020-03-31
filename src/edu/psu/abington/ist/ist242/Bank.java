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

public class Bank {
    int bankID;
    int cScore;

    public Bank(int bankID, int cScore) {
        this.bankID = bankID;
        this.cScore = cScore;
    }

    public int getCustomerCreditScore() {
        return cScore;
    }

    public void checkCustomerCreditScore() {
        if (cScore >= 650 && cScore <= 850) {
            //Customer approved
        }
        else if (cScore < 650) {
            //Customer denied
        }
    }
}
