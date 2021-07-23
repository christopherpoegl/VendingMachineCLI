package com.techelevator.vending;

public class Item {
    private String position;
    private String name;
    private String price;
    private String type;

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

    public Item(String position, String name, String price, String type){
        this.position = position;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
