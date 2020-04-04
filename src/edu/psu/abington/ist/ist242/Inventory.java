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

public class Inventory {

    private int inventoryId;
    private Car Car;

    //Constructor Method
    public Inventory(int _inventoryId, Car _Car){
        this.inventoryId = _inventoryId;
        this.Car = _Car;
    }

    // Setters
    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    public void setCar(edu.psu.abington.ist.ist242.Car car) {
        Car = car;
    }

    // Getters
    public edu.psu.abington.ist.ist242.Car getCar() {
        return Car;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", Car=" + Car +
                '}';
    }
}
