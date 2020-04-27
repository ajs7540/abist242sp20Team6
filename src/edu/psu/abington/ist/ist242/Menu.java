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

        /**
         * This accepts the user input and checks for input validation.
         *
         * @param int a                    The highest option for the options that are valid
         * @param Integer userInputA       What the user enters when scanner prompts a input.
         * @return                         The integer that is between int a and zero.
         * @author                         Tom Fadelsak
         * @version                        1.0
         * @since                          <pre>Apr 26, 2020</pre>
         */

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

        /**
         * This is the sales person main menu.
         * 'q' to quit , 'v'iew inventory , 'a'dd car , 'e'dit car , 'r'emove car from inventory , 'c'heck credit score
         *
         * @param char c                   The option called from getAction that the sales person will enter
         *
         * @author                         Team 6
         * @version                        1.0
         * @since                          <pre>Apr 26, 2020</pre>
         */

        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory \n'c'heck credit score", "qvaerc");
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
                    int id = callmenu(cars.size());
                    cars.get(id - 1).removeCar(cars);
                    break;
                case 'e':
                    Car.printInventory(cars);
                    System.out.println("Select what car you would like to edit?");
                    int carIndex = callmenu(cars.size()) - 1;  //get index of car from user.

                    char promptInput = Main.getAction("Press 1 to edit Year\nPress 2 to edit \"is new?\"\nPress 3 to edit make of car\nPress 4 to edit model of car\nPress 5 to edit color\nPress 6 to edit selling price\nPress m to go to main menu", "123456mq");
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
                                char t = Main.getAction("Enter color 'R'ED, 'G'REEN, 'B'LUE, or 'W'HITE: ", "rgbwq");
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
                        promptInput = Main.getAction("Press 1 to edit Year\nPress 2 to edit \"is new?\"\nPress 3 to edit make of car\nPress 4 to edit model of car\nPress 5 to edit color\nPress 6 to edit selling price\nPress m to go to main menu", "123456mq");
                    }
                case 'c':
                    Customer.printCustomers(customerList);
                    c = Main.getAction("Type in customer ID", "([\\d]+)+");
                    int a = Integer.parseInt(String.valueOf(c));
                    for (Customer cust : customerList) {
                        if (cust.userID == a) {
                            Bank.checkCreditScore(cust.creditScore);
                            break;
                        }
                    }
            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'a'dd car\n'e'dit car\n'r'emove car from inventory\n 'c'heck credit score\n", "qvaerc");
        }
    }
    public static Order customerMenu(ArrayList<Car> cars, ArrayList<Customer> customerList, ArrayList<Order> orders){
        return customerMenu(cars, customerList, orders, null);
    }
    public static Order customerMenu(ArrayList<Car> cars, ArrayList<Customer> customerList, ArrayList<Order> orders, User currentCustomer) {

        /**
         * This is the customer main menu
         * 'q' to quit , 'v'iew inventory , 'u'pdate your info , 'p' To purchase a car , 's'how info.
         *
         * @param char c                   The option called from getAction that the customer will enter
         *
         * @author                         Team 6
         * @version                        1.0
         * @since                          <pre>Apr 26, 2020</pre>
         */

        char c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n's'how info\n'o'rder history", "qvupso");
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
                    System.out.println("Enter Date of Order (mm/dd/yyyy)");
                    String date;
                    date = scnr.next();
                    Car currentCar = cars.get(option - 1);
                    Order order = new Order(date, currentCar);
                    orders.add(order);
                    break;


                case 'o':
                    Order.printOrders(orders);
                    break;

                case 's':
                    Scanner scnr2 = new Scanner(System.in);
                    System.out.println("Please Enter your ID: ");
                    int cid = Integer.parseInt(scnr2.nextLine());
                    for (Customer custom : customerList) {
                        if (custom.userID == cid) {
                            System.out.println("Your Address is " + custom.getAddress());
                            System.out.println("Your E-mail is " + custom.geteMail());
                            break;
                        }
                    }
                    break;


                case 'u':
                    for (int i = 0; i < customerList.size(); i++) {
                        if (customerList.get(i).userID == currentCustomer.userID ) {
                            char in = Main.getAction("Select: 'A'ddress, 'E'mail, 'Q'uit", "aeq");
                            Scanner scnr3 = new Scanner(System.in);
                            switch (in) {
                                case 'a':
                                    System.out.println("Please Enter your NEW Address: ");
                                    customerList.get(i).setAddress(scnr3.nextLine());
                                    break;
                                case 'e':
                                    System.out.println("Please Enter your NEW Email: ");
                                    customerList.get(i).seteMail(scnr3.nextLine());
                                    break;
                                case 'q':
                                    break;
                            }
                        }
                    }

            }
            c = Main.getAction("Select an action or press 'q' to quit:\n'v'iew inventory\n'u'pdate your info\n'p' To purchase a car\n's'how info\n'o'rder history '", "qvupso");
        }
        return null;
    }
}
