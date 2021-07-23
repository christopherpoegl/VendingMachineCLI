package com.techelevator.vending;

public class Selection {
    String userInput;

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    Stocker stocker = new Stocker();

    public void createList(){
        stocker.createList();
    }

    public void findItems(){

        for(int i = 0; i < stocker.items.size(); i++){

            Item selected = stocker.items.get(i);
            if(selected.getPosition().equals(userInput)){
                Integer stockRemaining = Integer.parseInt(selected.getStock());

                if(stockRemaining>0) {
                    stockRemaining--;
                    selected.setStock(stockRemaining.toString());
                    System.out.println(selected.getItemInfoToString());
                }
                else if(stockRemaining<=0){
                 System.out.println(selected.getItemInfoToString()+" SOLD OUT!");
                }
            }
        }
    }
    public void getItemList(){

        for(Item tempList : stocker.items)
            System.out.println(tempList.getItemInfoToString());

    }


}
