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
public class SalesPerson extends User {

    int salesID;
    String firstName, lastName, salesPassword;


    public SalesPerson(int userID, String userName, String passWord, String eMail, String Address) {
        super(userID, userName, passWord, eMail, Address);
    }

    public void setSalesPerson(String fname, String lname, int salesID , String sPass)
        {
            this.firstName = fname;
            this.lastName = lname;
            this.salesID =salesID;
            this.salesPassword = sPass;
        }

        public String getSalesPassword()
        {
            return salesPassword;
        }

        public String getFirstName()
        {
            return firstName;

        }

        public String getLastName()
        {
            return lastName;
        }

        public void addSalesPerson(SalesPerson salesMan, ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.add(salesMan);

        }

        public void removeSalesPerson(SalesPerson salesMan, ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.remove(salesMan);

        }


}
