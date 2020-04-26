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

    /**
     * This is the payment information for each order that is created.
     *
     * @param int paymentID                  A integer that is incrementally generated for each payment of the application to uniquely identify them.
     * @param Date paymentDate               The date stored for each payment. See date class for more details.
     * @param String paymentType             The stored/saved payment type for each payment. (Cash / Credit card)
     * @param boolean paymentAccepted        If True, Then payment was accepted ELSE If False, Payment was denied
     * @param int userID                     A user of the application that is attached to the payment information.
     * @param float paymentAmount            A float value for each stored for each payment.
     *
     * @author                               Team 6
     * @version                              1.0
     * @since                                <pre>Apr 26, 2020</pre>
     */


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

    PaymentInformation paymentInformation = new PaymentInformation();

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
