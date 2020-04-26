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


public class User {

    /**
     * This describes all the users that are using the application.
     *
     * @param int userID            A integer that is incrementally generated for each user of the application to uniquely identify them.
     * @param String userName       The stored/saved username for each user that is checked for auth at the beginning of the application.
     * @param String passWord       The stored/saved password for each user that is checked for auth at the beginning of the application.
     * @param String Address        The stored/saved address for each user.
     * @param String eMail          The stored/saved email address for each user.
     * @author                      Team 6
     * @version                     1.0
     * @since                       <pre>Apr 26, 2020</pre>
     */

    public int userID;
    public String userName;
    public String Address;
    public String eMail;
    public String passWord;

    public User(int userID, String userName, String passWord, String eMail, String Address)
    {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.Address = Address;

    }

    public int getID()
    {
        return userID;
    }

    public String getPassword()
    {
        return passWord;
    }

    public String getName()
    {
        return userName;

    }

    public void setAddress(String address) {
        Address = address;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail()
    {
        return eMail;
    }

    public String getAddress()
    {
        return Address;
    }
}
