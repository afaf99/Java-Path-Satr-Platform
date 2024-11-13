package org.example;

public class Motorcycle extends Vehicle{

    private int enginSize;

    public Motorcycle(String brand, String model, String ownerName, int year, int enginSize) {
        super(brand, model, ownerName, year);
        this.enginSize = enginSize;
    }

    public int getEnginSize() {
        return enginSize;
    }

    public void setEnginSize(int enginSize) {
        this.enginSize = enginSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Owner: "+ getOwnerName());
        System.out.println("Car: "+ getBrand() + " model: "+ getModel()+ " year: (" +getYear()+ ") ");
        System.out.println("Engin Size: " +getEnginSize());
    }

}
