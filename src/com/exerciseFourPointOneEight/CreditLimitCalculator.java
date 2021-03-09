package com.exerciseFourPointOneEight;
//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".


public class CreditLimitCalculator {
    private int accountNumber;
    private int beginningBalance = 0;
    private int totalItemsCharged;
    private int totalCreditsAppliedFor;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBeginningBalance(int accountBalance) {
        this.beginningBalance = accountBalance;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalsItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalCreditsAppliedFor(int totalCreditsAppliedFor) {
        this.totalCreditsAppliedFor = totalCreditsAppliedFor;
    }

    public int getTotalCreditsAppliedFor() {
        return totalCreditsAppliedFor;
    }

    public double setAllowedCreditLimit(int newBalance) {
        double allowedCreditLimit = 0.1 * newBalance;
        return allowedCreditLimit;
    }


    public int setNewBalance(int beginningBalance, int totalItemsCharged, int totalCreditsAppliedFor) {
        int newBalance = beginningBalance + totalItemsCharged - totalCreditsAppliedFor;
        return newBalance;
    }
}
