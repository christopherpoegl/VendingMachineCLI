package com.techelevator.vending;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Stocker {
    List<Item> items = new ArrayList<>();
    File file = new File("vendingmachine.csv");

    public void createList() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String tempLine = scanner.nextLine();
                tempLine = tempLine.replace("|", ",");
                String[] lineArr = tempLine.split(",");
                String position = lineArr[0];
                String name = lineArr[1];
                String price = lineArr[2];
                String type = lineArr[3];
                if (type.equals("Chip")) {
                    items.add(new Chip(position, name, price, type));
                } else if (type.equals("Candy")) {
                    items.add(new Candy(position, name, price, type));
                } else if (type.equals("Drink")) {
                    items.add(new Drink(position, name, price, type));
                } else if (type.equals("Gum")) {
                    items.add(new Gum(position, name, price, type));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
