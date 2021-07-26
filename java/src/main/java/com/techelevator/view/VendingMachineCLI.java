package com.techelevator.view;
import com.techelevator.vending.Log;
import com.techelevator.vending.Selection;
import java.util.Scanner;
public class VendingMachineCLI {
    Log log = new Log();
    Selection selection = new Selection();
    Purchase purchase = new Purchase();

    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
    private static final String SECOND_MENU_OPTION_FEED_MONEY = "Feed Money";
    private static final String SECOND_MENU_OPTION_SELECT_PRODUCT = "Select Product";
    private static final String SECOND_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] SECOND_MENU_OPTIONS = { SECOND_MENU_OPTION_FEED_MONEY,
            SECOND_MENU_OPTION_SELECT_PRODUCT, SECOND_MENU_OPTION_FINISH_TRANSACTION };
    private double userMoneyIn=0;
    private Menu menu;


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
                    String choiceSecond = (String) menu.getChoiceFromSecondMenu(SECOND_MENU_OPTIONS);
                    if (choiceSecond.equals(SECOND_MENU_OPTION_FEED_MONEY)) {
                        handleInput();
                        double userMoney = userMoneyIn*100;
                        int userPennies = (int)userMoney;
                        purchase.addMoney(userPennies);
                        log.writeToFile("FEED MONEY");
                        userMoneyIn = 0;
                    } else if (choiceSecond.equals(SECOND_MENU_OPTION_SELECT_PRODUCT)) {
                        selection.findItems();
                    } else if (choiceSecond.equals(SECOND_MENU_OPTION_FINISH_TRANSACTION)) {
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
        System.out.println("Please enter a dollar amount. Ex 5.00");
        while (userMoneyIn == 0) {

            try {
                userMoneyIn = Double.parseDouble(userIn.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("That was not a number.");
            }if(userMoneyIn%1!=0){
                System.out.println("Please enter a whole dollar amount. Ex 5.00");
                userMoneyIn=0;
            }

        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}