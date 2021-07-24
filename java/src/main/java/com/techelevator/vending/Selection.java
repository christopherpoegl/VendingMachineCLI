package com.techelevator.vending;
<<<<<<< HEAD
public class Selection {
    Stocker stocker = new Stocker();
    String userInput;

    public void createList(){
        stocker.createList();
    }

=======

public class Selection {
    Stocker stocker = new Stocker();
    String userInput;
    public void createList(){
        stocker.createList();
    }
>>>>>>> 54e3d4f4c92a9f7b548559b770b2e96e3f40c72f
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
<<<<<<< HEAD
                else System.out.println(selected.getItemInfoToString()+" SOlD OUT!");
=======
                else System.out.println(selected.getName() + "-$" + selected.getPrice() + "== Stock Remaining:" + selected.getStock());
>>>>>>> 54e3d4f4c92a9f7b548559b770b2e96e3f40c72f
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
<<<<<<< HEAD
}
=======


}
>>>>>>> 54e3d4f4c92a9f7b548559b770b2e96e3f40c72f
