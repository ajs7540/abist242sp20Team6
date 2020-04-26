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

    /**
     * This is the Sales Persons users using the application.
     *
     * @param int bankID            A integer that is incrementally generated for each bank of the application to uniquely identify them.
     * @param int cScore            A integer that is created for each customer of the application to have a credit score for purchasing a car.
     *
     * @author                      Team 6
     * @version                     1.0
     * @since                       <pre>Apr 26, 2020</pre>
     */

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


    public static boolean checkCreditScore(int cScore) {

        /**
         * This is the Sales Persons users using the application.
         *
         * @param int cScore                 A integer that is created for each customer of the application to have a credit score for purchasing a car.
         * @param boolean approved           A boolean that returns true if cScore is between 650 and 850, ELSE False.
         *
         * @return                           The boolean value of approved
         * @author                           Team 6
         * @version                          1.0
         * @since                            <pre>Apr 26, 2020</pre>
         */

        boolean approved = false;
        if (cScore >= 650 && cScore <= 850) {
            approved = true;
            System.out.println("Credit Approved");
        } else if (cScore < 650) {
            approved = false;
            System.out.println("Credit denied");
        }
        return approved;
    }
}
