package org.java.satr;

public class Calculator {
    public static void main(String[] args) {

        int numOne = 5;
        int numTwo = 10;
        char operation = '+';

        if (operation == '+'){
            System.out.println(numOne + numTwo);
        }
        else if (operation == '-') {
            System.out.println(numOne - numTwo);
        }
        else if (operation == '*') {
            System.out.println(numOne * numTwo);
        } else if (operation == '/') {
            System.out.println(numOne / numTwo);
        }
        else {
            System.out.println("The operation does not exist");
        }


    }
}
