package com.techelevator.vending;
import com.techelevator.view.Purchase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Log {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Purchase purchase = new Purchase();
    String printOutput;

    private String logString = "Nothing here yet.";


    public void setSelectedItemString(String set){
        this.logString = set;
    }

    public void writeToFile(String lineOfText) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String date = dateTime.format(myFormatObj);
        if (lineOfText.contains("FEED MONEY")) {
            try(PrintWriter printWriter = new PrintWriter( new FileOutputStream("log.txt", true))){
                printOutput = (">" + date + " FEED MONEY: " + "\\" + formatter.format((double)purchase.getMoneyFed()/100) + " \\" + formatter.format((double)purchase.getTheBalance()/100));
                printWriter.println(printOutput);
                printWriter.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if (lineOfText.contains("product selected")) {
            try(PrintWriter printWriter = new PrintWriter( new FileOutputStream("log.txt", true))){
                printOutput = (">" + date +" "+ logString + "\\$" + formatter.format((double)purchase.getMoneyFed()/100)) + " \\" + formatter.format((double)purchase.getTheBalance()/100);
                printWriter.println(printOutput);
                printWriter.flush();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if (lineOfText.contains("Make Change")) {
            try(PrintWriter printWriter = new PrintWriter( new FileOutputStream("log.txt", true))){
                printOutput = (">" + date +" "+ "GIVE CHANGE: " + "\\" + formatter.format((double)purchase.getTheBalance()/100)+"\\$0.00");
                printWriter.printf(printOutput+"\n");
                printWriter.flush();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if (lineOfText.contains("Exit")) {
            try(PrintWriter printWriter = new PrintWriter( new FileOutputStream("log.txt", true))){
                printOutput = ">\\`\\`\\`";
                printWriter.printf(printOutput+"\n");
                printWriter.flush();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}