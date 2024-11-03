package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int height;
        int weight;
        double BMI;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Welcome To The BMI Calculator");
        System.out.println("Please Enter Your Height :");
        height = scanner.nextInt();

        System.out.println("Please Enter Your Weight");
        weight = scanner.nextInt();

        BMI =  (weight / Math.pow(height / 100.0, 2));

        if(BMI <18.5){
            System.out.println("Your BMI Is " + BMI +  ", And Based On The Calculated BMI You Have (Underweight)" );
        } else if(BMI >=18.5 && BMI <= 24.9){
            System.out.println("Your BMI Is " + BMI +  ", And Based On The Calculated BMI You Have (Normal Weight))" );
        } else if(BMI >=25 && BMI <= 29.9){
            System.out.println("Your BMI Is " + BMI +  ", And Based On The Calculated BMI You Have (Overweight))" );
        } else if(BMI >= 30){
            System.out.println("Your BMI Is " + BMI +  ", And Based On The Calculated BMI You Have (Obese))" );
        }

        scanner.close();

    }
}