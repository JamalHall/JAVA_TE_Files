package com.techelevator.filereader;

import com.techelevator.items.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private File inventoryFile;


    public InventoryFileReader(File inventoryFile) {
        this.inventoryFile = inventoryFile;

    }

    // mapping of file to code and catering item
    public Map<String, CateringItem> createInventory()throws FileNotFoundException {

    Map<String,CateringItem> inventoryMapping = new HashMap<String, CateringItem>();

    try(Scanner fileScanner = new Scanner(inventoryFile)) {
        while (fileScanner.hasNextLine()){
            String currentLine = fileScanner.nextLine();
            String[] currentCateringItem = currentLine.split("\\|");
            CateringItem item = null;

            //creating a new catering item that will populate when called
            if(currentCateringItem[0].equalsIgnoreCase("B")){
                item = new Beverage(currentCateringItem[2],Double.parseDouble(currentCateringItem[3]));
            }
            if(currentCateringItem[0].equalsIgnoreCase("E")){
                item = new Entree(currentCateringItem[2],Double.parseDouble(currentCateringItem[3]));
            }
            if(currentCateringItem[0].equalsIgnoreCase("A")){
                item = new Appetizer(currentCateringItem[2],Double.parseDouble(currentCateringItem[3]));
            }
            if(currentCateringItem[0].equalsIgnoreCase("D")){
                item = new Dessert(currentCateringItem[2],Double.parseDouble(currentCateringItem[3]));
            }
            inventoryMapping.put(currentCateringItem[1],item);


            }// end while loop
    }
        return inventoryMapping;
    }


}
