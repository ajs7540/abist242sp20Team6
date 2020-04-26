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

        /**
         * This is the Sales Persons users using the application.
         *
         * @param int userID            A integer that is incrementally generated for each user of the application to uniquely identify them.
         * @param String userName       The stored/saved username for each Sales Persons that is checked for auth at the beginning of the application.
         * @param String passWord       The stored/saved password for each Sales Persons that is checked for auth at the beginning of the application.
         * @param String Address        The stored/saved address for each Sales Persons.
         * @param String eMail          The stored/saved email address for each Sales Persons.
         * @author                      Team 6
         * @version                     1.0
         * @since                       <pre>Apr 26, 2020</pre>
         */

    }

        public void addSalesPerson(ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.add(this);

        }

        public void removeSalesPerson(ArrayList<SalesPerson> salesTeam)
        {
            salesTeam.remove(this);
        }

    public static void printSalesTeam(ArrayList<SalesPerson> salesTeam){
        for (SalesPerson sp: salesTeam){
            System.out.println("Sales Person Id:" + sp.getID());
            System.out.println("Sales Person Name:" + sp.getName());
            System.out.println("Sales Person Email:" + sp.geteMail());
            System.out.println("Sales Person Address:" + sp.getAddress());
        }
    }

    public static boolean checkPassword(String username, String password, ArrayList<SalesPerson> salesTeam ) {

        /**
         * This checks the password and username that the salesperson inputs when they are logging in.
         *
         * @param String userName            The stored/saved username for each Sales Persons that is checked for auth at the beginning of the application.
         * @param String passWord            The stored/saved password for each Sales Persons that is checked for auth at the beginning of the application.
         * @param ArrayList SalesPerson      The stored/saved sales persons inside the application.
         * @author                           Team 6
         * @version                          1.0
         * @since                            <pre>Apr 26, 2020</pre>
         */

        boolean found = false;
            for (SalesPerson sp : salesTeam) {
                if (sp.userName.equals(username) && sp.passWord.equals(password)) {
                    found = true;
                    break;
                }
            }
        return found;
    }

}
