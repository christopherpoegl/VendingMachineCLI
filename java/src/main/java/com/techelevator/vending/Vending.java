package com.techelevator.vending;

public class Vending {

    public static void main(String[] args) {


        Stocker stocker = new Stocker();

        Chip potatoCrisp = new Chip(stocker.getPosition(), stocker.getName(), stocker.getPrice(), stocker.getType());
        System.out.println(potatoCrisp.getName());
    }
}
