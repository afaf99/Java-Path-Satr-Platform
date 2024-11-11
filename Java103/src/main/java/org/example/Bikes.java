package org.example;

public class Bikes extends VehicleRegistration{

    private int engineCapacity;

    public Bikes(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Bikes(String countryOfManufacture, String vehicleModel, int yearOfManufacture, int engineCapacity) {
        super(countryOfManufacture, vehicleModel, yearOfManufacture);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info are: " +getCountryOfManufacture() + getVehicleModel()+ getEngineCapacity()+ " " + getYearOfManufacture());

    }
}
