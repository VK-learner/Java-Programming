package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator; // This line might throw ArithmeticException

            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // This block executes if a division by zero occurs
            System.err.println("Error: Cannot divide by zero! Please enter a non-zero denominator.");
            System.err.println("Exception message: " + e.getMessage());

        } catch (InputMismatchException e) {
            // This block executes if the user enters non-integer input
            System.err.println("Error: Invalid input! Please enter integers only.");
            System.err.println("Exception message: " + e.getMessage());
            // Consume the invalid input to prevent an infinite loop
            scanner.next();

        } catch (Exception e) {
            // This is a general catch block that can catch any other unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // This block always executes, useful for closing resources
            System.out.println("Program execution finished. Closing scanner.");
            scanner.close(); // Close the scanner to release resources
        }

        System.out.println("Program continues after try-catch block.");
    }
}