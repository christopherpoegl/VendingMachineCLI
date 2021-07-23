package com.techelevator.vending;

public class Selection {
    Stocker stocker = new Stocker();

    public void createList(){
        stocker.createList();
    }

    public void findItems(){

        String userInput;

        for(int i = 0; i < stocker.items.size(); i++){

            Item selected = stocker.items.get(i);
            if(selected.getPosition().equals("A2")){
                Integer stockRemaining = Integer.parseInt(selected.getStock());
                if(stockRemaining>0) {
                    stockRemaining--;
                    selected.setStock(stockRemaining.toString());
                    System.out.println(selected.getItemInfoToString());
                }
                else System.out.println(selected.getName() + "-$" + selected.getPrice() + "== Stock Remaining:" + selected.getStock());
            }
        }
    }
    public void getItemList(){

        for(Item tempList : stocker.items)
            System.out.println(tempList.getItemInfoToString());

    }


}
