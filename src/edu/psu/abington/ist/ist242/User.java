package edu.psu.abington.ist.ist242;

public class User {

    public int userID = 1;
    public String userName;
    public String Address;
    public String eMail;
    public String passWord;

    private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};

    public User(int userID, String userName, String passWord,
                    String eMail, String Address)
    {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.Address = Address;

    }

    public boolean checkPassword(String username, String password)
    {
        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])) || (username.equals(accounts[1][0])) && (password.equals(accounts[1][1])))
            return true;
        else
            return false;
    }
}
