package com.techelevator.vending;

import com.techelevator.view.Purchase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Log {
    Selection selection = new Selection();
    Purchase purchase = new Purchase();
    String printOutput;
    double moneyFed = (double) (purchase.getMoneyFed() / 100);
    double currentBalance = (double) (purchase.getTheBalance()/ 100);
    private DecimalFormat df2 = new DecimalFormat("#.##");



    public Log() {

    }
    public void writeToFile(String lineOfText) {


        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        //System.out.println(dateTime.format(myFormatObj));

        //System.out.println((double)purchase.getMoneyFed()/100);

        String date = dateTime.format(myFormatObj);
        try {
            PrintWriter printWriter = new PrintWriter("log.txt");
            //System.out.println(lineOfText);
            //Scanner scanner = new Scanner(System.in);
            //String newText = scanner.nextLine();
            if (lineOfText.contains("FEED MONEY")) {
                printOutput = (">" + date + " FEED MONEY: " + "\\$" + df2.format((double)purchase.getMoneyFed()/100) + " \\$" + df2.format((double)purchase.getTheBalance()/100));
                System.out.println(printOutput);
                printWriter.println(printOutput);
                printWriter.flush();
            }
           // else if (lineOfText.contains("product selected") {
             //   printOutput = (">" + date + selection.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}