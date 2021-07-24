package com.techelevator.vending;


import com.techelevator.view.Purchase;

public class Selection {
    Purchase purchase = new Purchase();
    Stocker stocker = new Stocker();
    String userInput;
    public void getStockerList(){
        stocker.createList();
    }

    public void findItems(){
        for(int i = 0; i < stocker.items.size(); i++){
            Item selected = stocker.items.get(i);
            if(selected.getPosition().equals("A2")){
                Integer stockRemaining = Integer.parseInt(selected.getStock());
                if(stockRemaining>0) {
                    double price1 = Double.parseDouble(selected.getPrice()) * 100;
                    int price = (int) price1;
                    if (purchase.getTheBalance() > price) {
                        stockRemaining--;
                        selected.setStock(stockRemaining.toString());
                        System.out.println(selected.getItemInfoToString());
                        selected.purchaseMessage();
                        purchase.withdrawMoney(price);
                    }else System.out.println("Feed me money!");
                }else System.out.println(selected.getItemInfoToString()+" SOlD OUT!");

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

