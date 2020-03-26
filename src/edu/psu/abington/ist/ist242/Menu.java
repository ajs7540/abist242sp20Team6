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
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public static Integer callmenu(int a) {
        try {
            System.out.println("Enter a number between 1 and " + a + " or q for quit.");
            Scanner sc = new Scanner(System.in);
            Integer userInputA = sc.nextInt();

            while ((userInputA > a) || (userInputA <= 0)) {
                System.out.println("Invalid input");
                userInputA = sc.nextInt();
            }

            return userInputA;
        } catch (Exception e){
            System.exit(0);
        }
        return null;
    }
}
