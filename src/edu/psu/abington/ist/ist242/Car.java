package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Car {
    int carID, sellingPrice;
    boolean isNew;
    String make, year, model, color;
    private ArrayList <Car>newCars;
    private ArrayList <Car>oldCars;

    public void setCarDetails (int carID, boolean isNew, int sellingPrice, String make, String year, String model, String color)
    {
        this.carID = carID;
        this.isNew = isNew;
        this.sellingPrice = sellingPrice;
        this.make = make;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void getCarDetails ()
    {
        System.out.println("Car ID: "+ carID);
        System.out.print("it is ");
        if (isNew) System.out.println("New");
        else System.out.println("Used");
        System.out.println("Selling Price: "+ sellingPrice);
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);

    }

    public void oldCarsInventory(){
        oldCars = new ArrayList<>();
    }

    public void newCarsInventory(){
        newCars = new ArrayList<>();
    }

    public void addCar(Car car1) {
        if (isNew) {
            newCars.add(car1);
        } else {
            oldCars.add(car1);
        }
    }
    public void removeCar(Car car1){
            if (isNew) {
                newCars.remove(car1);
            }
            else{
                oldCars.remove(car1);
            }
        }
    }

