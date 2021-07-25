package com.techelevator.vending;

public class Drink extends Item implements ConsumptionNoise{

    public Drink(String position, String name, String price, String type) {
        super(position, name, price, type);
    }

    @Override
    public void purchaseMessage() {
        System.out.println("Chug Chug, Yum!");
    }
}
