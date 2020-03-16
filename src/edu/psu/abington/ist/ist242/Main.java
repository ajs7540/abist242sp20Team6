package edu.psu.abington.ist.ist242;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = "";
        while (operation != "q") {

            //checks for input valadation(IS 1,2,q???)
            System.out.println("Enter 1 for login as customer");
            System.out.println("Enter 2 for login as sales person");
            System.out.println("Enter 3 register");
            System.out.println("Enter q to quit");
            while (!sc.hasNext("[1, 2, 3, q]")) {
                System.out.println("That's not a valid operation");
                operation = sc.next();
            }


            if (operation.equals("1")) {
                System.out.println("Enter UserName:");
                String customerUserName = sc.next();
                System.out.println("Enter password:");
                String customerPassword = sc.next();
                if (customerUserName == customer.checkUserNames()) {
                }
                else if (operation.equals("2")) {
                    if (customerPassword == customer.checkUserPassword()) {

                    }

                } else if (operation.equals("q")) {
                    break;
                }


            }
        }
    }
}
