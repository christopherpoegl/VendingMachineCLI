package com.techelevator.view;

import java.lang.module.FindException;
import java.util.Scanner;

public class Purchase {
    private static int theBalance;

    {
        theBalance = 0;


    }

    public void addMoney(int feedMoney) {

        theBalance = theBalance + feedMoney;
        System.out.println(theBalance);
    }

    public void withdrawMoney(int moneyOut) {
        theBalance = theBalance - (moneyOut);
        System.out.println(theBalance);

    }

    public int moneyInCents() {
        return theBalance;
    }

    public String stringBalance() {
        int currentBalanceAsInt = theBalance;
        double currentBalanceAsDouble = (currentBalanceAsInt / 100);
        String formattedDoubleAsString = "$" + String.format("%.2f", currentBalanceAsDouble);
        return formattedDoubleAsString;
    }


    public void changeBack() {
        theBalance = this.theBalance;
        int temp = theBalance;
        int amountOfQuarters = 0;
        int amountOfDimes = 0;
        int amountOfNickels = 0;
        int quarters = 25;
        int dime = 10;
        int nickels = 5;
        if (temp > 0) {


            {
                amountOfQuarters = temp / 25;
                temp = temp % 25;
                amountOfDimes = temp / 10;
                temp = temp % 10;
                amountOfNickels = temp / 5;
                temp = temp % 5;

                System.out.println(amountOfQuarters + " quarters, " + amountOfDimes
                        + " dimes, " + amountOfNickels + " nickels");

            }


        }


    }
}