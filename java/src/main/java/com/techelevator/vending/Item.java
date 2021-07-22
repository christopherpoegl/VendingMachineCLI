package com.techelevator.vending;

public abstract class Item {
    private String position;
    private String name;
    private String price;
    private String type;
    private String stock;

    public Item(String position, String name, String price, String type){
        this.position = position;
        this.name = name;
        this.price =  price;
        this.type = type;

    }
}
