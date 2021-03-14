package com.exerciseFourPointTwoOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LargestNumberDeterminant largestNumberDeterminant;
        int largestNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        largestNumber = input.nextInt();
        largestNumberDeterminant=new LargestNumberDeterminant(largestNumber);

        for (int i = 1; i < 10; i++) {
            System.out.println("enter a number: ");
             largestNumber = input.nextInt();
             largestNumberDeterminant.setNumber(largestNumber);
        }
        System.out.println("the largest number is " + largestNumberDeterminant.getLargestNumber());
    }
}
