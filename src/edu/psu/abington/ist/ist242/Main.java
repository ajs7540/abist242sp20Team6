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
            System.out.println("Please login");
        }

    }
}