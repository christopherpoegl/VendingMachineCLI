package com.techelevator.vending;


public class Selection {
    Stocker stocker = new Stocker();
    String userInput;
    public void createList(){
        stocker.createList();
    }

    public void findItems(){
        for(int i = 0; i < stocker.items.size(); i++){
            Item selected = stocker.items.get(i);
            if(selected.getPosition().equals("A2")){
                Integer stockRemaining = Integer.parseInt(selected.getStock());
                if(stockRemaining>0) {
                    stockRemaining--;
                    selected.setStock(stockRemaining.toString());
                    System.out.println(selected.getItemInfoToString());
                }

                else System.out.println(selected.getItemInfoToString()+" SOlD OUT!");


            }
        }
    }
    public void getItemList(){
        for(Item tempList : stocker.items)
            System.out.println(tempList.getItemInfoToString());
    }
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

}

