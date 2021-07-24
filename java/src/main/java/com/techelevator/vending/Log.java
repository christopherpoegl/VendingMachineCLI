package com.techelevator.vending;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Log {
    Selection selection = new Selection();


    public Log() {

    }
    public void writeToFile(String lineOfText) {
        try {
            PrintWriter printWriter = new PrintWriter("log.txt");
            printWriter.print(lineOfText);
            System.out.println(lineOfText);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
