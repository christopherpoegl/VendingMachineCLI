package com.techelevator.view;

import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseTest {

   Purchase purchaseTest = new Purchase();


    @Test
    public void getMoneyFed() {

        int moneyFedActual = Purchase.getMoneyFed();
        int moneyFedExpected = 0;

        assertEquals(moneyFedActual,moneyFedExpected);

        

    }

    @Test
    public void getTheBalance() {

        int theBalanceActual = Purchase.getTheBalance();
        int theBalanceExpected = 0;

        assertEquals(theBalanceActual,theBalanceExpected);


    }






}