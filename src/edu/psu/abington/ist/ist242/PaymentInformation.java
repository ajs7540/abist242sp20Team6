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
import java.util.Date;
public class PaymentInformation {

    int paymentID = 123456789;
    Date paymentDate;
    String paymentType;
    boolean paymentAccepted;
    public int userID;
    float paymentAmount;
public void setPaymentInformation(int paymentID, Date paymentDate, String paymentType, boolean paymentAccepted,
                          int userID, float paymentAmount){

    this.userID = userID;
    this.paymentID = paymentID;
    this.paymentType = paymentType;
    this.paymentAccepted = paymentAccepted;
    this.paymentAmount = paymentAmount;
    this.paymentDate = paymentDate;

}

public void setPaymentDate(){
    Date setPaymentDate1 = new Date();
}
public void updatePayment(){

    ///need to consult with team

}
public void getPaymentInformation () {
    System.out.println("Payment ID: " + paymentID);
    System.out.println("User ID: " + userID);
    System.out.println("Payment Type: " + paymentAmount);
    System.out.print("Payment status: ");
    if (paymentAccepted) {
        System.out.println("Accepted");
    } else System.out.println("Declined");
    System.out.println("Payment Amount: " + paymentAmount);
    System.out.println("Payment Date "+ paymentDate);

    }

}
