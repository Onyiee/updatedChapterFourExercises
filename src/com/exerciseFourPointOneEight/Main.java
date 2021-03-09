package com.exerciseFourPointOneEight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your five-digit account number: ");
        int accountNumber = input.nextInt();

        System.out.println("Enter your beginning balance: ");
        int beginningBalance = input.nextInt();

        System.out.println("Enter the total items you've been charged this month: ");
        int totalItemsCharged = input.nextInt();

        System.out.println("Enter the total credits you have applied for: ");
        int totalCreditsAppliedFor = input.nextInt();

        System.out.println("Your new balance is " + creditLimitCalculator.setNewBalance(beginningBalance,totalItemsCharged,totalCreditsAppliedFor));

        System.out.println("Your allowed credit limit is 10% of your new balance.");


        if ( totalCreditsAppliedFor <= creditLimitCalculator.setAllowedCreditLimit(creditLimitCalculator.setNewBalance(beginningBalance,totalItemsCharged,totalCreditsAppliedFor))  ){

            System.out.println(accountNumber + " " + "Your beginning balance is " + " "  + beginningBalance + " \n" + "Your new balance is " +
                    creditLimitCalculator.setNewBalance(beginningBalance,totalItemsCharged,totalCreditsAppliedFor));
            System.out.println("You're eligible for the applied credit.");
        }else{
            System.out.println("Credit limit exceeded.");
        }

    }

}
