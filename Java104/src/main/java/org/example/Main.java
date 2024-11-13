package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);

        int choice =0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Update a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Display vehicles");
            System.out.println("5. Display details of a vehicle");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Choose the vehicle type");
                    System.out.println("1. Car");
                    System.out.println("2. Motorcycle");
                    System.out.println("3. Truck");

                    System.out.println("Enter the vehicle (1-3) : ");
                    int vehicleTypeChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (vehicleTypeChoice) {
                        case 1:
                            System.out.print("Enter owner name: ");
                            String carOwner = scanner.nextLine();
                            System.out.print("Enter vehicle brand: ");
                            String carBrand = scanner.nextLine();
                            System.out.print("Enter vehicle model: ");
                            String carModel = scanner.nextLine();
                            System.out.print("Enter vehicle year: ");
                            int carYear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter seating capacity: ");
                            int seatingCapacity = scanner.nextInt();
                            scanner.nextLine();
                            garage.addVehicle(new Car(carOwner, carBrand, carModel, carYear, seatingCapacity));
                            break;

                        case 2:
                            System.out.print("Enter owner name: ");
                            String motorcycleOwner = scanner.nextLine();
                            System.out.print("Enter vehicle brand: ");
                            String motorcycleBrand = scanner.nextLine();
                            System.out.print("Enter vehicle model: ");
                            String motorcycleModel = scanner.nextLine();
                            System.out.print("Enter vehicle year: ");
                            int motorcycleYear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter engine size: ");
                            int engineSize = scanner.nextInt();
                            scanner.nextLine();
                            garage.addVehicle(new Motorcycle(motorcycleOwner, motorcycleBrand, motorcycleModel, motorcycleYear, engineSize));
                            break;

                        case 3:
                            System.out.print("Enter owner name: ");
                            String truckOwner = scanner.nextLine();
                            System.out.print("Enter vehicle brand: ");
                            String truckBrand = scanner.nextLine();
                            System.out.print("Enter vehicle model: ");
                            String truckModel = scanner.nextLine();
                            System.out.print("Enter vehicle year: ");
                            int truckYear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter engine capacity: ");
                            int engineCapacity = scanner.nextInt();
                            scanner.nextLine();
                            garage.addVehicle(new Truck(truckOwner, truckBrand, truckModel, truckYear, engineCapacity));
                            break;

                        default:
                            System.out.println("Invalid vehicle type choice.");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Enter current owner name of the vehicle to update: ");
                    String updateOwner = scanner.nextLine();
                    System.out.print("Enter new owner name: ");
                    String owner = scanner.nextLine();
                    System.out.print("Enter new vehicle brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter new vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter new vehicle year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    garage.updateVehicle(brand, model, year, owner, updateOwner);
                    break;

                case 3:
                    System.out.print("Enter owner name of the vehicle to remove: ");
                    String removeOwner = scanner.nextLine();
                    garage.removeVehicle(removeOwner);
                    break;

                case 4:
                    garage.displayVehicles();
                    break;

                case 5:
                    System.out.print("Enter owner name of the vehicle to display details: ");
                    String displayOwner = scanner.nextLine();
                    garage.displayVehicleDetails(displayOwner);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}