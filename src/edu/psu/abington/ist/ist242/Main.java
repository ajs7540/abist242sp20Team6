package edu.psu.abington.ist.ist242;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Car Dealership Program!");
        System.out.println("Please select from the following options");

        System.out.println("Enter 1 to Login");
        System.out.println("Enter q to Quit");
        int a = Menu.callmenu(1);
        if(a == 1){
            for(int i = 0; i < 3; i++){
                System.out.println("Please login");
                String username;
                String password;

                Scanner sc = new Scanner(System.in);

                System.out.println("Username: ");
                username = sc.nextLine();

                System.out.println("Password: ");
                password = sc.nextLine();

                User login = new User(username, password);

                if (login.checkPassword()) {
                    System.out.println("You are logged in!");
                    i = 3;
                } else {
                    System.out.println("The username and password you entered are incorrect.\nYou have " + (2 - i) + " more attempts until program quits.");
                }
            }
        }
    }
}