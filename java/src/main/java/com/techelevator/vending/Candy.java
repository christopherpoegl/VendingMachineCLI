package com.techelevator.vending;

public class Candy extends Item implements ConsumptionNoise{

    public Candy(String position, String name, String price, String type) {
        super(position, name, price, type);
    }


    @Override
    public void purchaseMessage() {
        System.out.println("Munch Munch, Yum!");
    }


}
