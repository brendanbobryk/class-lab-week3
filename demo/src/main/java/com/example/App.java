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

        while (!input.equals("q")) {
            System.out.println();
            System.out.print("Enter a number, or type q to quit: ");
        }

        System.out.println("The user quit. Thank you.");

        scan.close();
    }
}
