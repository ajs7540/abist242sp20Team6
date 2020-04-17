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
        } catch (Exception e) {
            System.exit(0);
        }
        return null;
    }

    public static void salesPersonMenu(ArrayList<Car> cars, ArrayList<Customer> customerList) {
        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory \n'c'heck credit score");
        while (c != 'q') {
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
                case 'e':
                    Car.printInventory(cars);
                    System.out.println("Select what car you would like to edit?");
                    int carIndex = callmenu(cars.size()) - 1;  //get index of car from user.

                    char promptInput = Main.getAction("Press 1 to edit Year\nPress 2 to edit \"is new?\"\nPress 3 to edit make of car\nPress 4 to edit model of car\nPress 5 to edit color\nPress 6 to edit selling price\nPress m to go to main menu");
                    Scanner scnr1 = new Scanner(System.in);
                    while (promptInput != 'm') {
                        switch (promptInput) {
                            case '1':
                                System.out.println("Enter year:");
                                cars.get(carIndex).setYear(scnr1.nextInt());
                                break;
                            case '2':
                                System.out.println("Press n for New\nPress u for used");
                                String isNew = scnr1.next();
                                if (isNew == "n") {
                                    cars.get(carIndex).setNew(true);
                                } else if (isNew == "u") {
                                    cars.get(carIndex).setNew(false);
                                } else {
                                    cars.get(carIndex).setNew(false);  //input validation default to used
                                }
                                break;
                            case '3':
                                System.out.println("Enter Make:");
                                cars.get(carIndex).setMake(scnr1.next());
                                break;
                            case '4':
                                System.out.println("Enter Model");
                                cars.get(carIndex).setModel(scnr1.next());
                                break;
                            case '5':
                                char t = Main.getAction("Enter color 'R'ED, 'G'REEN, 'B'LUE, or 'W'HITE: ");
                                Car.Color color;
                                switch (t) {
                                    case 'r':
                                        cars.get(carIndex).setColor(Car.Color.RED);
                                        break;
                                    case 'g':
                                        cars.get(carIndex).setColor(Car.Color.GREEN);
                                        break;
                                    case 'b':
                                        cars.get(carIndex).setColor(Car.Color.BLUE);
                                        break;
                                    case 'w':
                                        cars.get(carIndex).setColor(Car.Color.WHITE);
                                        break;
                                    default:
                                        cars.get(carIndex).setColor(Car.Color.WHITE);  //input validation default to used
                                        break;
                                }
                                break;
                            case '6':
                                System.out.println("Enter selling price");
                                cars.get(carIndex).setSellingPrice(scnr1.nextInt());
                                break;
                        }
                        promptInput = Main.getAction("Press 1 to edit Year\nPress 2 to edit \"is new?\"\nPress 3 to edit make of car\nPress 4 to edit model of car\nPress 5 to edit color\nPress 6 to edit selling price\nPress m to go to main menu");
                    }
                    case 'c':
                    Customer.printCustomers(customerList);
                    c = Main.getAction("Type in customer ID");
                    int a = Integer.parseInt(String.valueOf(c));
                    for (Customer cust : customerList) {
                        if (cust.userID == a) {
                            Bank.checkCreditScore(cust.creditScore);
                            break;
                        }
                    }
            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory");
        }
    }

    public static Order customerMenu(ArrayList<Car> cars, ArrayList<Customer> customerList) {
        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n");
        while (c != 'q') {
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
                    Car.getCarDetails(cars.get(option - 1));  //user selected vic
                    Scanner scnr = new Scanner(System.in);
                    System.out.println("Enter Date of Order ");
                    String date;
                    date = scnr.next();
                    Car currentCar = cars.get(option - 1);
                    Order order = new Order(date, currentCar);      //creates a new order
                    return order;
                case 'u':
                    int customerIndex = callmenu(customerList.size()) - 1;
                    System.out.println("Update: 'A'ddress, 'E'mail, or 'Q'uit");
                    Scanner scnr2 = new Scanner(System.in);
                    switch(customerIndex){
                        case 'A':
                        System.out.println("Please Enter your NEW Address: ");
                        customerList.get(customerIndex).setAddress(scnr2.next());

                        case 'E':
                        System.out.println("Please Enter your NEW Email: ");
                        customerList.get(customerIndex).seteMail(scnr2.next());
                        case 'Q':
                        break;
                    }
            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n");
        }
        return null;
    }
}
