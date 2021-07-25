package com.techelevator.view;

import com.techelevator.vending.Log;
import com.techelevator.vending.Selection;

public class VendingMachineCLI {
    Selection selection = new Selection();
    Purchase purchase = new Purchase();
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
    private static final String[] PURCHASE_MENU_OPTIONS = { "Feed Money", "Select Product", "Finish Transaction" };
    private Menu menu;
    Log log = new Log();
    String test2String = "test";
    public VendingMachineCLI(Menu menu) {
        this.menu = menu;
    }
    public void run() {
        selection.getStockerList();
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                selection.getItemList();
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                displayPurchaseMenuOptions();
                System.out.println(test2String);
            }else{
                System.out.println("Thank you for visiting");
                System.exit(1);
            }
        }
    }
    private void displayPurchaseMenuOptions() {
        boolean stay = true;

        if (stay) {
            String choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
            if (choice.equals("Feed Money")) {
                //menu.feedMoney();
                purchase.addMoney(525);
                System.out.println("feedMoney");
                log.writeToFile("FEED MONEY");
            }
            else if (choice.equals("Select Product")) {
                selection.setUserInput("A2");
                selection.findItems();
                log.writeToFile("product selected");
            }else if (choice.equals("Finish Transaction")) {
                //menu.makeChange();
                purchase.changeBack();
                System.out.println("makeChange");
                log.writeToFile(".75");
                stay = false;
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }


}

