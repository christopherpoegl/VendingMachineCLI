package com.techelevator.vending;

public class Gum extends Item{
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

    public Gum(String position, String name, String price, String type) {
        super(position, name, price, type);
        Stocker stocker = new Stocker();
        this.position = stocker.getPosition();
        this.name = stocker.getName();
        this.price = stocker.getPrice();
        this.type = stocker.getType();
    }
}
