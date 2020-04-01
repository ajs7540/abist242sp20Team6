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

public class Car {
    int carID, sellingPrice, year;
    boolean isNew;
    String make, model;
    private ArrayList <Car>newCars;
    private ArrayList <Car>oldCars;
    Color color;

    enum Color
    {
        RED, GREEN, BLUE, BLACK, WHITE;
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

    public void oldCarsInventory(){
        oldCars = new ArrayList<>();
    }

    public void newCarsInventory(){
        newCars = new ArrayList<>();
    }

    public void addCar(ArrayList <Car> cars)
    {
        cars.add(this);
    }
    public void removeCar(Car car1){
            if (isNew) {
                newCars.remove(car1);
            }
            else{
                oldCars.remove(car1);
            }
        }

        public static void printInventory (ArrayList <Car> cars)
        {
            for (Car car: cars){
                Car.getCarDetails(car);
            }
        }
    }

