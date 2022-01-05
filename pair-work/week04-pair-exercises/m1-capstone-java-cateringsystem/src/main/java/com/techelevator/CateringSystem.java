package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/*
    This class should encapsulate all the functionality of the Catering system, meaning it should
    contain all the "work"
 */
public class CateringSystem {

    private Map<String, CateringItem> inventory = new HashMap<String, CateringItem>();

    public CateringSystem (File file) throws FileNotFoundException {
        InventoryFileReader inventoryFileReader = new InventoryFileReader(file);
        this.inventory = inventoryFileReader.createInventory();
    }

    public Map<String, CateringItem> getInventory() {
        return inventory;
    }
}
