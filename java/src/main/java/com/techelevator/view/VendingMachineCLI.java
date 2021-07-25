package com.techelevator.view;
import com.techelevator.vending.Log;
import com.techelevator.vending.Selection;
import com.techelevator.vending.UserInput;

import java.util.Scanner;

public class VendingMachineCLI {
    UserInput userIn = new UserInput();
    Selection selection = new Selection();
    Purchase purchase = new Purchase();
    double userMoneyIn=0;
    boolean run = false;
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
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
        selection.getStockerList();
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                selection.getItemList();
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                while (true) {
                    String choice2 = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
                    if (choice2.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
                        System.out.println(purchase.getTheBalance());
                        handleInput();
                        double userMoney = userMoneyIn*100;
                        int userPennies = (int)userMoney;
                        purchase.addMoney(userPennies);
                        log.writeToFile("FEED MONEY");
                        userMoneyIn = 0;
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                        //userIn.setPosition();
                        selection.findItems();
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
                        log.writeToFile("Make Change");
                        purchase.changeBack();
                        break;
                    }
                }
            }else{
                System.out.println("Thank you for visiting");
                log.writeToFile("Exit");
                System.exit(1);
            }
        }
    }
    public void handleInput() {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter a dollar amount. Ex 5.25");
        while (userMoneyIn == 0) {
            try {
                this.userMoneyIn = Double.parseDouble(userIn.nextLine());
                run = false;
            } catch (NumberFormatException e) {
                System.out.println("not a number");
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}