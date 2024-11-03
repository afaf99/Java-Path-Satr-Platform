package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Afaf", "Reem", "Amal", "Asma", "Ali"));
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(100, 90, 88, 75, 65));

        addStudent(scanner, students, grades);
        displayStudents(students, grades);
    }

    public static void addStudent(Scanner scanner, ArrayList<String> students, ArrayList<Integer> grades) {

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.print("Enter student's grade (0 - 100): \n");
        int grade = scanner.nextInt();
        scanner.nextLine();

        students.add(name);
        grades.add(grade);

        System.out.println("Student added successfully!");
    }

    public static void displayStudents(ArrayList<String> students, ArrayList<Integer> grades) {
        System.out.println("\nList of Students and Their Grades:");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%d. %s - Grade: %d%n", i + 1, students.get(i), grades.get(i));
        }

        try {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            if (grades.size() == 0) {
                throw new ArithmeticException("Cannot divide by zero: The grades list is empty.");
            }

            double average = (double) sum / grades.size();
            System.out.println("\nTo calculate the average: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error calculating average: " + e.getMessage());
        }
    }
}