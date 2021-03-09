package com.exerciseFourPointTwoZero;
//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//        three employees. The company pays straight time for the first 40 hours worked by each employee
//        and time and a half for all hours worked in excess of 40. You’re given a list of the employees,
//        their
//        number of hours worked last week and their hourly rates. Your program should input this
//        information for each employee, then determine and display the employee’s gross pay. Use class
//        Scanner to
//        input the data.

public class SalaryCalculator {
    private double grossPay = 0;
    private int hoursWorked;
    private int ratePerHour;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setGrossPay(int hoursWorked, int ratePerHour) {
        if (hoursWorked >= 1 && hoursWorked <= 40){
            grossPay = hoursWorked * ratePerHour;
        }
        if (hoursWorked > 40){
            grossPay = grossPayForHoursAbove40(hoursWorked,ratePerHour);
        }
    }

    private double grossPayForHoursAbove40(int hoursWorked,int ratePerHour){
        int extraHours = hoursWorked - 40;
        int firstFortyHoursWorked = hoursWorked - extraHours;
        double payForFirstFortyHours = firstFortyHoursWorked * ratePerHour;
        double overtimePay = 1.5 * ratePerHour;
        double overtimeBonus = overtimePay * extraHours;
        grossPay = overtimeBonus + payForFirstFortyHours;
        return grossPay;
    }

    public double getGrossPay() {
        return grossPay;
    }
}
