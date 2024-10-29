package org.java;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int numOne = 5;
        int numTwo = 10;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation (+, -, *, /)");
        char operation = scanner.next().charAt(0);

        if (operation == '+'){
            System.out.println("Result: " + (numOne + numTwo));
        }
        else if (operation == '-') {
            System.out.println("Result: " + (numOne - numTwo));
        }
        else if (operation == '*') {
            System.out.println("Result: " + (numOne * numTwo));
        }
        else if (operation == '/') {
            if (numTwo != 0) {
                System.out.println("Result: " + (numOne / numTwo));
            }
        }
        else {
            System.out.println("The operation does not exist");
        }
        scanner.close();
    }
}
