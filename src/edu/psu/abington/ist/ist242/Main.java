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
                    System.out.println("Enter 1 to view current cars in car inventory");
                    System.out.println("Enter 2 to do option 2");
                    System.out.println("Enter 3 to do option 3");
                    System.out.println("Enter 4 to do option 4");
                    System.out.println("Enter q to Quit");
                    int b = Menu.callmenu(4);
                    if(b == 1){
                        //This is option 1
                        System.out.print("Option: " + b);
                    }
                    else if(b == 2){
                        //This is option 1
                        System.out.print("Option: " + b);
                    }
                    else if(b == 3){
                        //This is option 1
                        System.out.print("Option: " + b);
                    }
                    else if(b == 4){
                        //This is option 1
                        System.out.print("Option: " + b);
                    }

                } else {
                    System.out.println("The username and password you entered are incorrect.\nYou have " + (2 - i) + " more attempts until program quits.");
                }
            }
        }
    }
}