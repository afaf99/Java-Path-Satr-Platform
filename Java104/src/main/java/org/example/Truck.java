package org.example;

public class Truck extends Vehicle{

    private double cargoCapacity;

    public Truck(String brand, String model, String ownerName, int year, double cargoCapacity) {
        super(brand, model, ownerName, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Owner: "+ getOwnerName());
        System.out.println("Car: "+ getBrand() + " model: "+ getModel()+ " year: (" +getYear()+ ") ");
        System.out.println("Car go Capacity: " +getCargoCapacity());
    }
}
