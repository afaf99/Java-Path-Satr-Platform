package org.example;

import java.util.ArrayList;

public class GarageManagement {


    private ArrayList<VehicleRegistration> vehicles = new ArrayList<>(); // قائمة لتخزين المركبات

    public void addVehicle(VehicleRegistration vehicle) {
        vehicles.add(vehicle);
    }

    public void displayAllVehicles() {
        for (VehicleRegistration vehicle : vehicles) {
            vehicle.displayInfo();
        }

    }

}