package com.techelevator.vending;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vending {

    public static void main(String[] args) {
        int stock = 5;

        List<Item> vendingList = new ArrayList<>();
        Map<Object, Integer> vendingMap = new HashMap<Object, Integer>();

        Stocker stocker = new Stocker();

        Chip potatoCrisp = new Chip(stocker.getPosition(), stocker.getName(), stocker.getPrice(), stocker.getType());

        vendingMap.put(potatoCrisp, stock);

        System.out.println(vendingMap.get(potatoCrisp));

        vendingList.add(potatoCrisp);

    }
}
