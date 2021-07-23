package com.techelevator.vending;

import com.techelevator.VendingMachineCLI;
import com.techelevator.vending.Selection;
import com.techelevator.view.Menu;

public class PurchaseMenu {

    Selection selection = new Selection();

    private static final String SECOND_MENU_OPTION_DISPLAY_ITEMS = "Feed Money";
    private static final String SECOND_MENU_OPTION_PURCHASE = "Select Product";
    private static final String SECOND_MENU_OPTION_FINISH = "Finish Transaction";
    private static final String[] SECOND_MENU_OPTIONS = { SECOND_MENU_OPTION_DISPLAY_ITEMS, SECOND_MENU_OPTION_PURCHASE };

    private Menu bla;

    public PurchaseMenu(Menu menu) {
        this.bla = menu;
    }

    public void run() {
        while (true) {
            String choice = (String) bla.getChoiceFromOptions(SECOND_MENU_OPTIONS);

            if (choice.equals(SECOND_MENU_OPTION_DISPLAY_ITEMS)) {
                // Meed Foney
            } else if (choice.equals(SECOND_MENU_OPTION_PURCHASE)) {
                // Do selection
            } else if (choice.equals(SECOND_MENU_OPTION_FINISH)) {
                //return to home screen
            }
        }
    }
    
}
