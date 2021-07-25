package com.techelevator.vending;
import com.techelevator.view.Purchase;
public class Selection {
    Log log = new Log();
    Purchase purchase = new Purchase();
    Stocker stocker = new Stocker();
    UserInput user = new UserInput();
    String userInput;
    String logText;
    Item selected;
    public void getStockerList(){
        stocker.createList();
    }
    public void findItems(){
        for(int i = 0; i < stocker.items.size(); i++){
            selected = stocker.items.get(i);
            if(selected.getPosition().equals(user.getUserSelection())){
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
                        logText = selected.getName()+ " "+selected.getPosition();
                        log.setSelectedItemString(logText);
                        log.writeToFile("product selected");
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
    public String getLogText() {
        return logText;
    }
}