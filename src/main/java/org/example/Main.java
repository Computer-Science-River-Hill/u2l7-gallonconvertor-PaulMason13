package org.example; // DO NOT DELETE

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of gallons: ");
        double g = s.nextDouble();

        double q = g * 4;
        double p = q * 2;
        double c = p * 2;
        double t = c * 16;

        System.out.println("\nIn " + g + " gallons there are:");
        System.out.println(q + " quarts");
        System.out.println(p + " pints");
        System.out.println(c + " cups");
        System.out.println(t + " tablespoons");

        s.close();
    }
}
