package edu.psu.abington.ist.ist242;
import java.util.ArrayList;
public class SalesPerson {

    int salesID;
    String firstName, lastName, salesPassword;
    private ArrayList<SalesPerson>salesTeam;
    public void setSalesPerson(String fname, String lname, int salesID , String sPass)

        {
            this.firstName = fname;
            this.lastName = lname;
            this.salesID =salesID;
            this.salesPassword = sPass;
        }

        public String getSalesPassword() {

            return salesPassword;
        }

        public String getFirstName() {

            return firstName;

        }

        public String getLastName() {

            return lastName;
        }

        public void addSalesPerson(SalesPerson salesMan){

            salesTeam.add(salesMan);

        }

        public void removeSalesPerson(SalesPerson salesMan){

            salesTeam.remove(salesMan);

        }


}
