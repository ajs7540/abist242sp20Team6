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
    int carID, sellingPrice, year;
    boolean isNew;
    String make, model;
  /*  private ArrayList <Car>newCars;
    private ArrayList <Car>oldCars;*/
    Color color;

    enum Color
    {
        RED, GREEN, BLUE, WHITE;
    }

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

  /*  public void oldCarsInventory(){
        oldCars = new ArrayList<>();
    }

    public void newCarsInventory(){
        newCars = new ArrayList<>();
    }
*/

    public static Car addNewCar(int carID)
    {
        Scanner scnr = new Scanner(System.in);
        int sellingPrice, year;
        boolean isNew;
        String make, model;
        Color color = Color.BLUE;

        if (Main.getAction("Is it new? 'y'es/ 'n'o: ") =='y') isNew = true;
        else isNew = false;

        System.out.println("Enter selling Price: ");
        sellingPrice = scnr.nextInt();

        System.out.println("Enter make: ");
        make = scnr.nextLine();

        System.out.println("Enter year: ");
        year = scnr.nextInt();

        System.out.println("Enter model: ");
        model = scnr.nextLine();

        char c = Main.getAction("Enter color 'R'ED, 'G'REEN, 'B'LUE, or 'W'HITE: ");
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

        public static void printInventory (ArrayList <Car> cars)
        {
            for (Car car: cars){
                Car.getCarDetails(car);
                System.out.println();
            }
        }
    }

