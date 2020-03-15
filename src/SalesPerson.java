public class SalesPerson {

    int salesID;
    String firstName, lastName, salesPassword;
    boolean salesFinalize;

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

}
