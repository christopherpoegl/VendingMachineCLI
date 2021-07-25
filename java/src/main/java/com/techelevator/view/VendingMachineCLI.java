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
                        userIn.handleInput();
                        double userMoney = userIn.getUserMoneyIn()*100;
                        int userPennies = (int)userMoney;
                        purchase.addMoney(userPennies);
                        log.writeToFile("FEED MONEY");
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                        userIn.setPosition();
                        selection.findItems();
                    } else if (choice2.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
                        log.writeToFile("Make Change");
                        purchase.changeBack();
                        break;
                    }
                }
            }else{
                System.out.println("Thank you for visiting");
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}

