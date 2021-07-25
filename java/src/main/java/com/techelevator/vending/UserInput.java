package com.techelevator.vending;
import java.util.Scanner;
public class UserInput {
    Stocker stocker = new Stocker();
    double userMoneyIn=0;
    String userSelection="no";
    public void handleInput(){
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter a dollar amount. Ex 5.25");
        while(userMoneyIn==0)
            try{
                this.userMoneyIn=Double.parseDouble(userIn.nextLine());
            }catch(NumberFormatException e){
                System.out.println("not a number");
            }
    }
//    public void setPosition() {
//        stocker.createList();
//        Scanner userPos = new Scanner(System.in);
//        System.out.println("Please enter your product's location. Ex A2");
//        String pos = userPos.nextLine();
//        // for (int i = 0; i < stocker.items.size(); i++) {
//        if (stocker.items.contains(pos)) {
//            userSelection = pos;
//        }else System.out.println("Invalid");
//    }
    //  }
    public double getUserMoneyIn() {
        return userMoneyIn;
    }
    public String getUserSelection() {
        return userSelection;
    }
}