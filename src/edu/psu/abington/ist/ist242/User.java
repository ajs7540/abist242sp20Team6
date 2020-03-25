package edu.psu.abington.ist.ist242;

public class User {

    private String username;
    private String password;
    public int userID = 1;
    public String userName;
    public String Address;
    public String eMail;
    public String passWord;

    private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};

    public User(int userID, String userName, String passWord,
                    String eMail, String Address, String username, String password)
    {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.eMail = eMail;
        this.Address = Address;
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword()
    {
        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])) || (username.equals(accounts[1][0])) && (password.equals(accounts[1][1])))
            return true;
        else
            return false;
    }
}
