package com.techelevator.view;

import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseTest {
    Purchase purchaseTest = new Purchase();


    @Test
    public void getMoneyFed() {

        purchaseTest.addMoney(500);
        int moneyFedActual = purchaseTest.getMoneyFed();
        int moneyFedExpected = 500;

        assertEquals(moneyFedActual,moneyFedExpected);
<<<<<<< HEAD


=======
        purchaseTest.changeBack();
>>>>>>> bd52b9376709e30ad54d47b1f96a122f6cbfe2db

    }

    @Test
    public void getTheBalance() {

        purchaseTest.addMoney(100);
        purchaseTest.addMoney(100);
        int theBalanceActual = purchaseTest.getTheBalance();
        int theBalanceExpected = 200;

        assertEquals(theBalanceActual,theBalanceExpected);
        purchaseTest.changeBack();

    }

    @Test
    public void addMoneyTest() {

       purchaseTest.addMoney(500);
        int balanceActual = purchaseTest.getTheBalance();
        int balanceExpected = 500;

        assertEquals(balanceExpected, balanceActual);
        purchaseTest.changeBack();

    }

    @Test
    public void withdrawMoneyTest(){
        purchaseTest.addMoney(1000);
        purchaseTest.withdrawMoney(500);
        int actual = purchaseTest.getTheBalance();
        int expected = 500;
        assertEquals(expected, actual);
        purchaseTest.changeBack();

    }






}