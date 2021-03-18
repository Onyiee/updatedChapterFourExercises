package com.exerciseFourPointOneNine;
//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item Value
//        1 239.99
//        2 129.75
//        3 99.95
//        4 350.89
//        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

public class SalesCommissionCalculator {
    private double value;
    private double grossSales = 0;
    private double payWithCommission;


    public void setPayWithCommission(double grossSales) {
        int basePay = 200;
        double percentageCommission = 0.9;
         payWithCommission = basePay + percentageCommission * grossSales;
//        return payWithCommission;
    }

    public double getPayWithCommission() {
        return payWithCommission;
    }

    public double listOfItemsWithTheirPrices(int itemNumber) {

        switch (itemNumber) {
            case 1 -> value = 239.99;
            case 2 -> value = 129.75;
            case 3 -> value = 99.95;
            case 4 -> value = 350.89;
        }
        return itemNumber;
    }

    public double grossSalesCalculator(int itemNumber) {
        listOfItemsWithTheirPrices(itemNumber);
         grossSales = grossSales + value;
         setPayWithCommission(grossSales);
         return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }
}
