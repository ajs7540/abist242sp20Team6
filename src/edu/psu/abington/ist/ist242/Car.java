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

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    /**
     * This is the Car object that describes each car in the car dealership inventory
     *
     * @param int carID                A integer that is incrementally generated for each car of the application to uniquely identify them.
     * @param int sellingPrice         integer price for each car
     * @param int year                 A integer for the year or the car
     * @param boolean isNew            A boolean for each car if true the car is new ELSE the car is old.
     * @param String Make              A String for the make or each car
     * @param String Model             A String for the model or each car
     * @param enum Color               A enum for each color options for all cars. (RED, GREEN, BLUE, WHITE)
     *
     * @author
     * @version                   1.0
     * @since                     <pre>Apr 26, 2020</pre>
     */

    int carID, sellingPrice, year;
    boolean isNew;
    String make, model;
    Color color;

    enum Color
    {
        RED, GREEN, BLUE, WHITE;
    }

    /**
     *
     * @param carID
     * @param isNew
     * @param sellingPrice
     * @param make
     * @param year
     * @param model
     * @param color
     */

    public Car (int carID, boolean isNew, int sellingPrice, String make, int year, String model, Color color)
    {


        this.carID = carID;
        this.isNew = isNew;
        this.sellingPrice = sellingPrice;
        this.make = make;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public static void getCarDetails (Car car)
    {
        System.out.println("Car ID: "+ car.carID);
        System.out.print("it is ");
        if (car.isNew) System.out.println("New");
        else System.out.println("Used");
        System.out.println("Selling Price: "+ car.sellingPrice);
        System.out.println("Make: "+ car.make);
        System.out.println("Model: "+ car.model);
        System.out.println("Year: "+ car.year);

    }



    public static Car addNewCar(int carID)
    {
        Scanner scnr = new Scanner(System.in);
        int sellingPrice, year;
        boolean isNew;
        String make, model;
        Color color = Color.BLUE;

        if (Main.getAction("Is it new? 'y'es/ 'n'o: ","yn") =='y') isNew = true;
        else isNew = false;

        System.out.println("Enter selling Price: ");
        sellingPrice = scnr.nextInt();

        System.out.println("Enter year: ");
        year = scnr.nextInt();

        System.out.println("Enter make: ");
        make = scnr.nextLine();
        if (make.matches("\\n")){ make = scnr.nextLine();}

        System.out.println("Enter model: ");
        model = scnr.nextLine();
        if (model.matches("\\n")){ model = scnr.nextLine();}

        char c = Main.getAction("Enter color 'R'ED, 'G'REEN, 'B'LUE, or 'W'HITE: ", "rgbw");
        switch (c)
        {
            case 'r':
                color = Color.RED;
                break;
            case 'g':
                color = Color.GREEN;
                break;
            case 'b':
                color = Color.BLUE;
                break;
            case 'w':
                color = Color.WHITE;
                break;
        }

        Car car = new Car(carID, isNew, sellingPrice, make, year, model, color);
        return car;
    }

    public void addCar(ArrayList <Car> cars)
    {
        cars.add(this);
    }

    public void removeCar(ArrayList <Car> cars)
    {
        cars.remove(this);
    }

        public static void printInventory (ArrayList <Car> cars) {
            for (Car car : cars) {
                Car.getCarDetails(car);
                System.out.println();
            }
        }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", sellingPrice=" + sellingPrice +
                ", year=" + year +
                ", isNew=" + isNew +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

