package com.techelevator.vending;

import com.techelevator.view.Purchase;

public class Main {
<<<<<<< HEAD
    public static void main(String[] args){
        Purchase moneyCalc = new Purchase();
        moneyCalc.addMoney(525);
        moneyCalc.withdrawMoney(105);
        moneyCalc.changeBack();

=======

    public static void main(String[] args){
        Selection selection = new Selection();
        selection.createList();
        selection.getItemList();
        System.out.println("----------------------");
        selection.findItems();
>>>>>>> cd16868e8cd114982f41c101ac6e48d7c1559c43



    }
}
