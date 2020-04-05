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

public class Bank {
    int bankID = 1;
    int cScore;

    public int getbankID() {
        return bankID;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public void checkCreditScore() {
        if (cScore >= 650 && cScore <= 850) {
            System.out.println("Credit Approved");
        } else if (cScore < 650) {
            System.out.println("Credit denied");
        }
    }
}
