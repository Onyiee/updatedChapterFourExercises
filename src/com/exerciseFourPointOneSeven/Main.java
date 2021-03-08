package com.exerciseFourPointOneSeven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();

        int milesDriven = 0;
        int gallonsUsed = 0;


        while ( gallonsUsed != -1){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter miles driven: ");
            milesDriven = input.nextInt();

            System.out.println("Enter gallons used: ");
            gallonsUsed = input.nextInt();

            System.out.println("The gas mileage for this trip is " + gasMileage.milesPerGallonCalculator
                    (milesDriven,gallonsUsed));
            System.out.println("The total gas mileage is " + gasMileage.getTotalMilesPerGallon());

        }


    }

}
