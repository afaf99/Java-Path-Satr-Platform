package org.example;

public class Cars extends VehicleRegistration{

    private int numberOfSeats;

    public Cars(int numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    public Cars(String countryOfManufacture, String vehicleModel, int yearOfManufacture, int numberOfSeats) {
        super(countryOfManufacture, vehicleModel, yearOfManufacture);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info are: " +getCountryOfManufacture() + getVehicleModel()+ getNumberOfSeats()+ " " + getYearOfManufacture());
    }
}
