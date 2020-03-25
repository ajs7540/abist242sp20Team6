package edu.psu.abington.ist.ist242;
import java.util.ArrayList;
public class SalesPerson extends User {

    int salesID;
    String firstName, lastName, salesPassword;
    private ArrayList<SalesPerson>salesTeam;

    public SalesPerson(int userID, String userName, String passWord, String eMail, String Address, String username, String password) {
        super(userID, userName, passWord, eMail, Address, username, password);
    }

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
