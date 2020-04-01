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

    public SalesPerson(int userID, String userName, String passWord, String eMail, String Address) {
        super(userID, userName, passWord, eMail, Address);
    }

        public void addSalesPerson(ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.add(this);

        }

        public void removeSalesPerson(ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.remove(this);
        }


}
