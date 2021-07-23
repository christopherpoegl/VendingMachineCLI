package com.techelevator.vending.testy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        int change = 90;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        quarters = change/25;
        change=change%25;
        dimes = change/10;
        change = change %10;
        nickles = change / 5;
        change = change %5;
        pennies = change/1;
        System.out.println(quarters+" " + dimes+ " " + nickles + " " + pennies);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        System.out.println(dateTime.format(myFormatObj));

    }
}
