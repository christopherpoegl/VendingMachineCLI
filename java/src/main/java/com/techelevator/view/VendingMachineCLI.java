package com.techelevator.view;

import com.techelevator.vending.Log;
import com.techelevator.vending.Selection;

public class VendingMachineCLI {
    Selection selection = new Selection();
    Purchase purchase = new Purchase();
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
    private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
    private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
    private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY,
            PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION };
    private Menu menu;
    Log log = new Log();
    public VendingMachineCLI(Menu menu) {
        this.menu = menu;
    }
    public void run() {
        selection.createList();
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                selection.getItemList();
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                while (true) {
                    String choice2 = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
                    if (choice2.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
                        //menu.feedMoney();
                        purchase.addMoney(525);
                        System.out.println("feedMoney");
                        log.writeToFile("5");
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                        selection.setUserInput("A2");
                        selection.findItems();
                        log.writeToFile("Item Location, Name");
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
                        //menu.makeChange();
                        purchase.changeBack();
                        System.out.println("makeChange");
                        log.writeToFile(".75");
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}

