package com.exerciseFourPointTwoZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number of hours worked: ");
            int hoursWorked = input.nextInt();

            System.out.println("Enter the rate per hour: ");
            int ratePerHour = input.nextInt();

            salaryCalculator.setGrossPay(hoursWorked,ratePerHour);
            System.out.println("Your gross pay is " + salaryCalculator.getGrossPay() );
        }
    }
}
