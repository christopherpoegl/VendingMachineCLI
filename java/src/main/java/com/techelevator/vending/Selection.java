package com.techelevator.vending;
import com.techelevator.view.Purchase;
import java.text.NumberFormat;
import java.util.Scanner;
public class Selection {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public String userSelection = "no";
    Log log = new Log();
    Purchase purchase = new Purchase();
    Stocker stocker = new Stocker();
    String logText;
    Item selected;
    public void getStockerList() {
        stocker.createList();
    }
    public void findItems() {
        setPosition();
        for (int i = 0; i < stocker.items.size(); i++) {
            selected = stocker.items.get(i);
            if (selected.getPosition().equals(userSelection)) {
                Integer stockRemaining = Integer.parseInt(selected.getStock());
                if (stockRemaining > 0) {
                    double price1 = Double.parseDouble(selected.getPrice()) * 100;
                    int price = (int) price1;
                    if (purchase.getTheBalance() > price) {
                        stockRemaining--;
                        selected.setStock(stockRemaining.toString());
                        System.out.println(selected.getItemInfoToString());
                        selected.purchaseMessage();
                        purchase.withdrawMoney(price);
                        logText = selected.getName() + " " + selected.getPosition();
                        log.setSelectedItemString(logText);
                        log.writeToFile("product selected");
                        userSelection="no";
                    } else System.out.println("You do not have sufficient funds for this purchase. You have "+
                            formatter.format((double)purchase.getTheBalance()/100)+" and "+selected.getName()+" costs $"+selected.getPrice());
                } else System.out.println(selected.getItemInfoToString() + " SOlD OUT!");
            }
        }
    }
    public void getItemList() {
        for (Item tempList : stocker.items)
            System.out.println(tempList.getItemInfoToString());
    }
    public void setPosition() {
        Scanner userPos = new Scanner(System.in);
        System.out.println("Please enter your product's location. Ex A2");
        String pos = userPos.nextLine();
        for (int i = 0; i < stocker.items.size(); i++) {
            if (stocker.items.get(i).getPosition().equals(pos)) {
                userSelection = pos;
            }
        }if(userSelection.equals("no")){
            System.out.println("Invalid Position please try again.");
        }
    }
}