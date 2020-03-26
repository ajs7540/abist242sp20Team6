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
    int bankID = 123456789;


    public void getCustomerCreditScore() {
        Customer.creditScore = cScore;
    }

    public void checkCustomerCreditScore() {
        if (cScore >= 650) && (cScore <= 850) {
            //credit approved
        }
        else if (cScore < 650) {
            //credit denied
        }
    }

    public void addPayment() {

    }

    public void searchPayment() {

    }
}
