package com.techelevator.vending;

public class Item implements ConsumptionNoise{
    private String position;
    private String name;
    private String price;
    private String type;
    private String stock;

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
    public String getStock(){
        return stock;
    }
    public void setStock(String set){
        this.stock = set;
    }
    public String getItemInfoToString(){
        String info = this.position +", "+ this.name +", "+ this.price +", Remaining Stock="+ this.stock;
        return info;
    }

    public Item(String position, String name, String price, String type){
        this.position = position;
        this.name = name;
        this.price = price;
        this.type = type;
        this.stock = "5";

    }

    @Override
    public void purchaseMessage() {
    }
}
