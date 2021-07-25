package com.techelevator.vending;

public class Chip extends Item implements ConsumptionNoise{

    public Chip(String position, String name, String price, String type) {
        super(position, name, price, type);
    }


    @Override
    public void purchaseMessage(){
        System.out.println("Crunch Crunch, Yum!");

    }

}
