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
