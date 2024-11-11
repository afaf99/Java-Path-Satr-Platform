# Vehicle Management System

## Project Overview
This project is a simple vehicle management application designed to handle the storage and management of vehicles within a garage. The application can store basic information about different types of vehicles, such as cars, motorcycles, and trucks.

## Requirements

### Class: Vehicle Registration
- Define methods to add and remove vehicles within the application.
- Each vehicle has specific information, such as model, year of release, and country of origin.

### Classes for Each Vehicle Type
- Define classes for each type of vehicle (Car, Motorcycle, Truck).
- Each class includes specific attributes, such as:
  - Cars: Number of seats.
  - Motorcycles: Engine capacity.
  - Trucks: Load capacity.

### Garage Management
- Store vehicles within a garage.
- Implement a function to display all vehicles currently in the garage.

## Implementation of OOP Principles

### Encapsulation
- Use the `private` modifier for the attributes in the `Vehicle` class and provide `setter` and `getter` methods.
- Define methods to add and remove vehicles from the garage.

### Abstraction
- Create an `abstract` class for `Vehicle` with its attributes and methods, such as `displayInfo()`.

### Inheritance
- Make the `Vehicle` class inheritable to allow the creation of specific vehicle types (Car, Motorcycle, Truck).
- Add unique attributes to each type in the respective subclasses (Car, Motorcycle, Truck).

### Polymorphism
- Implement method overriding for `displayInfo()` in each subclass to display vehicle details differently while using the same method.
- Implement method overloading for the add and remove methods in the garage, allowing additions or removals by vehicle model, year, or country of origin.



