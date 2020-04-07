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

    public static void salesPersonMenu(ArrayList<Car> cars)
    {
        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory");
        while(c!='q') {
            switch (c) {
                case 'v':
                    Car.printInventory(cars);
                    break;
                case 'a':
                    cars.add(Car.addNewCar(cars.get(cars.size() - 1).carID + 1));
                    break;
                case 'r':
                    Car.printInventory(cars);
                    System.out.println("Type in car ID to remove: ");
                    Scanner scnr = new Scanner(System.in);
                    int id = callmenu(cars.size());
                    cars.get(id - 1).removeCar(cars);
                    break;
            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory");
        }
    }

    public static Order customerMenu(ArrayList<Car> cars)
    {
        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n");
        while(c!='q') {
            switch (c) {
                case 'v':
                    Car.printInventory(cars);
                    break;

                case 'p':

                    int carQuantity = 0;
                    int option = 0;
                    for (Car car : cars) {
                        carQuantity++;
                    }
                    for (Car car : cars) {
                        Car.getCarDetails(car);
                        System.out.println();
                    }
                    option = Menu.callmenu(carQuantity);
                    Car.getCarDetails(cars.get(option - 1));
                    Scanner scnr = new Scanner(System.in);
                    System.out.println("Enter Date of Order ");
                    String date;
                    date = scnr.next();
                    Car currentCar = cars.get(option - 1);
                    Order order = new Order(date, currentCar);
                    return order;

            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n");
        }
        return null;
    }
}
