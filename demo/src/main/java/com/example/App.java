package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = "";
        Double number = 0.0, newNumber = 0.0;

        while (!input.equals("q")) {
            System.out.print("\nEnter a number, or type q to quit: ");
            input = scan.next();

            try {
                number = Double.parseDouble(input);
                newNumber = number + 10.0;
                System.out.println(number + " + 10 = " + newNumber);
            } catch (Exception e) {
                System.out.print("ERROR: " + input + " is not a floating point number. Please try again.\n");
            }

        }

        System.out.println("The user quit. Thank you.");

        scan.close();
    }
}
