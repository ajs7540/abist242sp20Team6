package edu.psu.abington.ist.ist242;

public class User {

    private String username;
    private String password;
    private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};

    public User(String username, String password) {
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
