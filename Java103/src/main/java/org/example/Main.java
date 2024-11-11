package org.example;

public class Main {
    public static void main(String[] args) {
        GarageManagement garageManagement = new GarageManagement();

        VehicleRegistration car = new Cars("USA ", "Toyota Camry ", 2020,3 );
        VehicleRegistration bike = new Bikes("USA ","Honda Accord ", 2019, 2500);
        VehicleRegistration truck = new trucks("USA ","Honda Accord ", 2019, 1000);


        garageManagement.addVehicle(car);
        garageManagement.addVehicle(bike);
        garageManagement.addVehicle(truck);


        garageManagement.displayAllVehicles();
    }
}
