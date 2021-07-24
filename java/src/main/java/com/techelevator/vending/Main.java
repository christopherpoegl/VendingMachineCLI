package com.techelevator.vending;
public class Main {
    public static void main(String[] args){
        Selection selection = new Selection();
        selection.createList();
        selection.getItemList();
        System.out.println("----------------------");
        selection.findItems();
    }
}