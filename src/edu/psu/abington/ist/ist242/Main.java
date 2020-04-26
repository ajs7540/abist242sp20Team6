/*
Project: Car Dealership Team 6
Purpose Details: A Application to manage a car dealership and customers buying cars.
Course: IST242
Author: Tom Fadelsak, William Perez, Amal Sabirov, Liliya Sadykova
Date Developed: 3/12/20
Last Date Changed: 4/20/2020
Revision: 0
*/

package edu.psu.abington.ist.ist242;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * A Car Dealership management system with authorization.
         * The Car Dealership program creates several arrays that stores information and has pre-determined logic.
         * The car management system is separated into a customer login and car salesperson.
         * The customer login only can buy a car and update account details. Whereas, the salesperson login can manage the car inventory, update car details and check credit on a customer.
         *
         * @param Customer Has several attributes describing a person using the application. A customer has a Username and password that is checked here before log in. A customer is added to the customer Array that makes up the users using the application.
         * @param SalesPerson Has several attributes describing a employee working at the car dealership using the application. A sales person also has a Username and password that is checked here before log in.
         * @param Order Has a attached car object along with a customer object. A order is added to the order Array that makes up the current orders with in the application.
         * @param Car Has several attributes describing a car such as make, model and price. A car is added to the car Array that makes up the Car Dealerships inventory that all users have access too.
         *
         * @author          Tom Fadelsak, William Perez, Amal Sabirov, Liliya Sadykova CLASS: IST242 JoeOaks
         * @version         1.0
         * @since           <pre>Apr 22, 2020</pre>
         */

        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<SalesPerson> salesTeam = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car(1, true, 7000, "Toyota", 2017, "Camry", Car.Color.BLUE);
        Car car2 = new Car(2, false, 8000, "Honda", 2016, "Civic", Car.Color.WHITE);
        Car car3 = new Car(3, true, 6500, "Ford", 2019, "Focus", Car.Color.GREEN);
        Car car4 = new Car(4, false, 9300, "Honda", 2015, "Accord", Car.Color.RED);
        Car car5 = new Car(5, true, 7200, "Toyota", 2019, "Corolla", Car.Color.BLUE);

        car1.addCar(cars);
        car2.addCar(cars);
        car3.addCar(cars);
        car4.addCar(cars);
        car5.addCar(cars);


        Customer cust1 = new Customer(1, "john", "john1", "john@email.com", "1 some street, PA", 600);
        Customer cust2 = new Customer(2, "anna", "anna1", "anna@email.com", "2 some street, PA", 701);
        Customer cust3 = new Customer(3, "pete", "pete1", "pete@email.com", "3 some street, PA", 702);
        Customer cust4 = new Customer(4, "sarah", "sarah1", "sarah@email.com", "4 some street, PA", 703);
        Customer cust5 = new Customer(5, "mat", "mat1", "mat@email.com", "5 some street, PA", 704);

        cust1.addCustomer(customerList);
        cust2.addCustomer(customerList);
        cust3.addCustomer(customerList);
        cust4.addCustomer(customerList);
        cust5.addCustomer(customerList);

        SalesPerson sp1 = new SalesPerson(1, "kate", "kate1", "kate@email.com", "1 other street, PA");
        SalesPerson sp2 = new SalesPerson(2, "sam", "sam1", "sam@email.com", "2 other street, PA");
        SalesPerson sp3 = new SalesPerson(3, "emma", "emma1", "emma@email.com", "3 other street, PA");
        SalesPerson sp4 = new SalesPerson(4, "max", "max1", "max@email.com", "4 other street, PA");
        SalesPerson sp5 = new SalesPerson(5, "ari", "ari1", "ari@email.com", "5 other street, PA");

        sp1.addSalesPerson(salesTeam);
        sp2.addSalesPerson(salesTeam);
        sp3.addSalesPerson(salesTeam);
        sp4.addSalesPerson(salesTeam);
        sp5.addSalesPerson(salesTeam);


        System.out.println("Welcome to Car Dealership Program!");
        System.out.println("Please select from the following options:");


        char c = getAction("Enter L to Login \nEnter c to create account \nEnter q to Quit", "lcq");
        if (c == 'l') {
            User currentUser = login(customerList, salesTeam);
            if (currentUser instanceof Customer)
            {
                System.out.println("-----------Customer menu-----------");
                Order completedOrder = Menu.customerMenu(cars, customerList, orders, currentUser);
                orders.add(completedOrder);
                Order.printOrders(orders);
            }
            else if (currentUser instanceof SalesPerson)
            {
                System.out.println("-----------Sales person menu-----------");
                Menu.salesPersonMenu(cars, customerList);
            }
            else
                {
                    System.out.println("You are not logged in.");
                }
        }
        else if (c=='c')
        {
            customerList.add(Customer.addNewCustomer(customerList.size()-1, customerList));
            System.out.println("-----------Customer menu-----------");
            Order completedOrder = Menu.customerMenu(cars, customerList, orders);
            orders.add(completedOrder);
            Order.printOrders(orders);
        }
    }


    public static char getAction(String prompt, String caseCheck) {

        /**
         * This accepts the user input and checks for input validation.
         *
         * @param String prompt       The print statement to the user when this method is called.
         * @param String caseCheck    The valid options of letters that the user must enter. If the input is not matched it will print invalid input to the user and try again.
         * @param String answer       What the user enters when scanner prompts a input.
         * @param char firstChar      The first letter that the user enters when answer scanner is called.
         * @return                    The first letter of answer if the first letter is match with a single char inside of caseCheck.
         * @author                    Team 6
         * @version                   1.0
         * @since                     <pre>Apr 26, 2020</pre>
         */

        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toLowerCase() + " ";
        char firstChar = answer.charAt(0);
        if (!caseCheck.contains(firstChar+"")){
            System.out.println("Invalid input");
            firstChar = getAction(prompt, caseCheck);
        }
        if (firstChar == 'q') System.exit(0);
        return firstChar;
    }

    public static User login(ArrayList<Customer> cList, ArrayList<SalesPerson> sTeam) {

        /**
         * This accepts the user input and checks for input validation.
         *
         * @param int j               The string that the user enters when prompt.
         * @param String userName     The first letter of the string the user enters.
         * @param String password     The first letter of the string the user enters.
         *
         * @return                    1 = if customer or 2 = sales person
         * @author                    Team 6
         * @version                   1.0
         * @since                     <pre>Apr 26, 2020</pre>
         */

        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i >= 0 ; i--) {
            System.out.println("Please login");

            System.out.println("Username: ");
            username = sc.nextLine();

            System.out.println("Password: ");
            password = sc.nextLine();

            if (Customer.checkPassword(username, password, cList))
            {
                for(Customer customer : cList) {
                    if (username.equals(customer.userName)) {
                        return customer;
                    }
                }
            }
            if (SalesPerson.checkPassword(username, password, sTeam)) {
                for (SalesPerson salesPerson : sTeam) {
                    if (username.equals(salesPerson.userName)) {
                        return salesPerson;
                    }
                }
            }
        System.out.println("The username and password you entered are incorrect.\nYou have " + i + " more attempts until program quits.");
        }
        return null;
    }
}