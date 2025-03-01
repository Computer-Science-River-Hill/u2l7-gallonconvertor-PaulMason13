package org.example; //DO NOT DELETE

import java.util.Scanner;
import java.text.NumberFormat;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        System.out.println("Enter the number of minutes spent on each of the following project tasks:");
        System.out.print("Designing: ");
        int designing = input.nextInt();

        System.out.print("Coding: ");
        int coding = input.nextInt();

        System.out.print("Debugging: ");
        int debugging = input.nextInt();

        System.out.print("Testing: ");
        int testing = input.nextInt();

        int totalTime = designing + coding + debugging + testing;

        double designingPercent = (double) designing / totalTime;
        double codingPercent = (double) coding / totalTime;
        double debuggingPercent = (double) debugging / totalTime;
        double testingPercent = (double) testing / totalTime;

        System.out.println("\nTask\t\t\t% Time");
        System.out.println("Designing:\t\t" + percentFormat.format(designingPercent));
        System.out.println("Coding:\t\t\t" + percentFormat.format(codingPercent));
        System.out.println("Debugging:\t\t" + percentFormat.format(debuggingPercent));
        System.out.println("Testing:\t\t" + percentFormat.format(testingPercent));

        input.close();
        }
        }
