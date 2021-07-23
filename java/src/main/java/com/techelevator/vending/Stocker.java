package com.techelevator.vending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stocker {


        String position;
        String name;
        String price;
        String type;
        String stock;

        String userInput = "A1";
        File vendingFile = new File("vendingmachine.csv");
        List<Item> vendingList = new ArrayList<>();


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

    public List<Item> getVendingList() {
        return vendingList;
    }

    {
            try {
                Scanner vending = new Scanner(vendingFile);
                while (vending.hasNextLine()) {

                    String inputLine = vending.nextLine();

                    if (inputLine.contains("Chip")) {
                        position = lineArr[0];
                      //  System.out.println(position);
                        name = lineArr[1];
                      //  System.out.println(name);
                        price = lineArr[2];
                       // System.out.println(price);
                        type = lineArr[3];
                       // System.out.println(type);
                        Chip chip = new Chip(position, name, price, type);
                        vendingList.add(chip);
                    }
                    else if (inputLine.contains("Candy")) {
                        position = lineArr[0];
                        //  System.out.println(position);
                        name = lineArr[1];
                        //  System.out.println(name);
                        price = lineArr[2];
                        // System.out.println(price);
                        type = lineArr[3];
                        // System.out.println(type);
                        Candy candy = new Candy(position, name, price, type);
                        vendingList.add(candy);
                    }
                    else if (inputLine.contains("Drink")) {
                        position = lineArr[0];
                        //  System.out.println(position);
                        name = lineArr[1];
                        //  System.out.println(name);
                        price = lineArr[2];
                        // System.out.println(price);
                        type = lineArr[3];
                        // System.out.println(type);
                        Drink drink = new Drink(position, name, price, type);
                        vendingList.add(drink);
                    }
                    else if (inputLine.contains("Gum")) {
                        position = lineArr[0];
                        //  System.out.println(position);
                        name = lineArr[1];
                        //  System.out.println(name);
                        price = lineArr[2];
                        // System.out.println(price);
                        type = lineArr[3];
                        // System.out.println(type);
                        Gum gum = new Gum(position, name, price, type);
                        vendingList.add(gum);
                    }

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
