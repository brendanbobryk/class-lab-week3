package com.example;

import java.util.Scanner;

/**
 * Week 3 - Write a program to add 10 to a number
 * Brendan Bobryk, 1036738
 */
public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // initializing variables
        String input = "";
        Double number = 0.0, newNumber = 0.0;

        while (!input.equals("q")) {
            System.out.print("\nEnter a number, or type q to quit: ");
            input = scan.next();

            // try to covert the string to a number
            try {
                number = Double.parseDouble(input);
                newNumber = number + 10.0;
                System.out.println(number + " + 10 = " + newNumber);
                // catch for error handling when letters are in the input
            } catch (Exception e) {
                System.out.print("ERROR: " + input + " is not a floating point number. Please try again.\n");
            }

        }

        // output for user quitting
        System.out.println("The user quit. Thank you.");

        // closing scanner
        scan.close();
    }
}
