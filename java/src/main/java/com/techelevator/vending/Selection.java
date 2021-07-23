package com.techelevator.vending;

public class Selection {

    public void findItems(){

        String userInput;

        Stocker stocker = new Stocker();
        stocker.createList();

        for(int i = 0; i < stocker.items.size(); i++){

            Item selected = stocker.items.get(i);
            if(selected.getPosition().equals("A2")){
                Integer stockRemaining = Integer.parseInt(selected.getStock());
                if(stockRemaining>0) {
                    stockRemaining--;
                    selected.setStock(stockRemaining.toString());
                    System.out.println(selected.getName() + "-$" + selected.getPrice() + "== Stock Remaining:" + selected.getStock());
                }
                else System.out.println(selected.getName() + "-$" + selected.getPrice() + "== Stock Remaining:" + selected.getStock());
            }
        }
    }
}
