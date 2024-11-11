package org.example;

abstract class VehicleRegistration {
    private String VehicleModel;
    private int yearOfManufacture;
    private String countryOfManufacture;

    public VehicleRegistration(String countryOfManufacture, String vehicleModel, int yearOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
        VehicleModel = vehicleModel;
        this.yearOfManufacture = yearOfManufacture;
    }

    public VehicleRegistration() {

    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void displayInfo();
}
