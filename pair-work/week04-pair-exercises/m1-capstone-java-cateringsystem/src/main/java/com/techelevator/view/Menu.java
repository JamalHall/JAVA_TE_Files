package com.techelevator.view;

import com.techelevator.items.CateringItem;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

/*
 * This is the only class that should have any usage of System.out or System.in
 *
 * Usage of System.in or System.out should not appear ANYWHERE else in your code outside of this class.
 *
 * Work to get input from the user or display output to the user should be done in this class, however, it
 * should include no "work" that is the job of the catering system.
 */
public class Menu {
	
	private static final Scanner in = new Scanner(System.in);

	public void showWelcomeMessage() {
		System.out.println("*************************");
		System.out.println("**     Weyland Corp.   **");
		System.out.println("**      Catering       **");
		System.out.println("*************************");
		System.out.println();
	}

	// Main Menu Display
	public void displayMainMenu() {
		System.out.println("**************************");
		System.out.println("**      Main Menu       **");
		System.out.println("**************************");
		System.out.println("(1) Display Catering Items");
		System.out.println("(2) Order");
		System.out.println("(3) Quit");
	}

	//Display File Request
	public void displayFileRequest(){
		System.out.println("***************************");
		System.out.println("** Input File Path Below **");
		System.out.println("***************************");
	}

	// get file from user
	public String getFilePathFromUser(){

		return in.nextLine();
	}


	// file not found method

	public void displayFileNotFound(File file) {
		System.out.println("Could not find file at file path: " + file.getAbsolutePath());
	}



	// Menu Input from User
	public int getUserMenuInput() {
		int userMenuSelectItem = Integer.parseInt(in.nextLine());
		return userMenuSelectItem;
	}

	// Catering Items Display
	public void displayCateringItems(Map<String, CateringItem> cateringInventory) {
		System.out.println("   Item Id   :   Product  :   Price $  :  Qty Available  ");
		System.out.println("---------------------------------------------------------");
		for( Map.Entry<String,CateringItem> currentEntry: cateringInventory.entrySet()){
			System.out.println(currentEntry.getKey() + currentEntry.getValue().getName() +
					currentEntry.getValue().getPrice() + currentEntry.getValue().getQuantity());
		};
		// if user selects 1, all catering items are displayed
		// product code, product name, purchase price, quantity remaining for each catering item
														// maximum 25. always begins full at beginning of program
														// if none remaining SOLD OUT
	}

	// Purchase Menu Display
	public void displayTransactionMenu(int currentBalance) {
		System.out.println("***************************");
		System.out.println("**   Transaction Menu    **");
		System.out.println("***************************");
		System.out.println("(1) Add Money");
		System.out.println("(2) Select Products");
		System.out.println("(3) Complete Transaction");
		System.out.println("Current Account Balance: $" + currentBalance);
	}




}




