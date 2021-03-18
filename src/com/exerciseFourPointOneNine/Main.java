package com.exerciseFourPointOneNine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of an item between 1 and 4 :");
        int itemNumber = input.nextInt();

        while (itemNumber != -10) {
            salesCommissionCalculator.grossSalesCalculator(itemNumber);

            System.out.println("Enter a number of an item between 1 and 4 :");
            itemNumber = input.nextInt();
        }
        System.out.println(salesCommissionCalculator.grossSalesCalculator(itemNumber));
        System.out.println(salesCommissionCalculator.getPayWithCommission());
    }
}
