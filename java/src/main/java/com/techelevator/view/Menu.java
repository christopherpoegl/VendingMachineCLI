package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;

public class Menu {
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	Purchase purchase = new Purchase();


	private PrintWriter out;
	private Scanner in;

	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}
	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}
	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}
	private void displayMenuOptions(Object[] options) {
		out.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");
		out.flush();
	}
	public Object getChoiceFromSecondMenu(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displaySecondMenuOptions(options);
			choice = getChoiceFromUserSecondMenu(options);
		}
		return choice;
	}
	private Object getChoiceFromUserSecondMenu(Object[] options){
			Object choiceSecond = null;
			String userInput = in.nextLine();
			try {
				int selectedOption = Integer.valueOf(userInput);
				if (selectedOption > 0 && selectedOption <= options.length) {
					choiceSecond = options[selectedOption - 1];
				}
			} catch (NumberFormatException e) {
				// eat the exception, an error message will be displayed below since choice will
				// be null
			}
			if (choiceSecond == null) {
				out.println("\n*** " + userInput + " is not a valid option ***\n");
			}
			return choiceSecond;

		}

	private void displaySecondMenuOptions(Object[] options) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}

		out.println("\nCurrent Money Provided: \\" + (formatter.format((double)purchase.getTheBalance()/100)));
		out.print("\nPlease choose an option >>> ");
		out.flush();
	}
}
