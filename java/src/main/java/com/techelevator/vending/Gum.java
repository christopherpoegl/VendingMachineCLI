package com.techelevator.vending;

public class Gum extends Item implements ConsumptionNoise{

    public Gum(String position, String name, String price, String type) {
        super(position, name, price, type);
    }

    @Override
    public void purchaseMessage() {
        System.out.println("Chew Chew, Yum!");
    }
}
