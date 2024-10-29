package org.java;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        int ID;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        firstName = scanner.nextLine();

        System.out.println("last  name: ");
        lastName = scanner.nextLine();

        System.out.println("ID: ");
        ID = scanner.nextInt();


        if (firstName.length() <= 2){
            System.out.println("first Name is not a valid first name. It is too short");
        } else if (firstName.trim().isEmpty()) {
            System.out.println("The last Name must be filled in");
        } else if (lastName.length() <= 2){
            System.out.println("first Name is not a valid first name. It is too short");
        } else if (lastName.trim().isEmpty()) {
            System.out.println("The last Name must be filled in");
        }
        else if (ID < 1000000000 || ID > 9999999999L){
            System.out.println("id is not a valid ID");
        } else{
            System.out.println("There were no errors found");
        }

        scanner.close();
    }
}
