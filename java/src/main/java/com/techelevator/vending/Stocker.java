package com.techelevator.vending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stocker {


        String position;
        String name;
        String price;
        String type;
        String stock;

        String userInput = "A1";
        File vendingFile = new File("vendingmachine.csv");


    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    {
            try {
                Scanner vending = new Scanner(vendingFile);
                while (vending.hasNextLine()) {

                    String inputLine = vending.nextLine();
                    inputLine = inputLine.replace("|", ",");//investigate later
                    String[] lineArr = inputLine.split(",");

                    if (inputLine.contains(userInput)) {

                        position = lineArr[0];
                      //  System.out.println(position);
                        name = lineArr[1];
                      //  System.out.println(name);
                        price = lineArr[2];
                       // System.out.println(price);
                        type = lineArr[3];
                       // System.out.println(type);
                    }

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
