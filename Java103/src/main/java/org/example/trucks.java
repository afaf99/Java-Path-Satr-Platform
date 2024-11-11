package org.example;

public class trucks extends VehicleRegistration{

    private int loadingCapacity;

    public trucks(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public trucks(String countryOfManufacture, String vehicleModel, int yearOfManufacture, int loadingCapacity) {
        super(countryOfManufacture, vehicleModel, yearOfManufacture);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Info are: " +getCountryOfManufacture() + getVehicleModel()+ getLoadingCapacity()+ " " + getYearOfManufacture());

    }
}
