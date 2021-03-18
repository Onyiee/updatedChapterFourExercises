package com.exerciseFourPointOneEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    CreditLimitCalculator creditLimitCalculator;

    @BeforeEach
    void setUp() {
        creditLimitCalculator = new CreditLimitCalculator();
    }

    @AfterEach
    void tearDown() {
    }
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".

    @Test
    void accountNumberCanBeSet(){
        creditLimitCalculator.setAccountNumber(02331);
        assertEquals(02331,creditLimitCalculator.getAccountNumber());
    }

    @Test
    void balanceAtTheBeginningOfTheMonthCanBeGotten(){
        creditLimitCalculator.setBeginningBalance(200);
        assertEquals(200,creditLimitCalculator.getBeginningBalance());
    }

    @Test
    void totalOfItemsChargedByTheCustomerInAMonthCanBeCalculated(){
        creditLimitCalculator.setTotalItemsCharged(10);
        assertEquals(10,creditLimitCalculator.getTotalsItemsCharged());
    }

    @Test
    void totalOfAllCreditsAppliedToCustomersAccountInAMonth(){
        creditLimitCalculator.setTotalCreditsAppliedFor(5000);
        assertEquals(5000,creditLimitCalculator.getTotalCreditsAppliedFor());
    }

    @Test
    void allowedCreditLimitCanBeCalculated(){
        creditLimitCalculator.setAllowedCreditLimit(25);
        assertEquals(2.5,creditLimitCalculator.setAllowedCreditLimit(25));
    }

    @Test
    void newBalanceCanBeCalculated(){
        creditLimitCalculator.setNewBalance(2000,15,10);
        assertEquals(2005,creditLimitCalculator.setNewBalance(2000,15,10));
    }
}