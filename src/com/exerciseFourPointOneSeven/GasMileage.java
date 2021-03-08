package com.exerciseFourPointOneSeven;
//4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful.
//        Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each
//        trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.

public class GasMileage {
    private int milesDriven;
    private int gallonsUsed;
    private double totalMilesPerGallon = 0;

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }


    public double milesPerGallonCalculator(int milesDriven, int gallonsUsed) {
        double milesPerGallon = (double)milesDriven/gallonsUsed;
        setTotalMilesPerGallon(milesPerGallon);
        return milesPerGallon;
    }

    public double setTotalMilesPerGallon(double milesPerGallon) {
         totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
        return totalMilesPerGallon;
    }

    public double getTotalMilesPerGallon() {
        return totalMilesPerGallon;
    }
}
