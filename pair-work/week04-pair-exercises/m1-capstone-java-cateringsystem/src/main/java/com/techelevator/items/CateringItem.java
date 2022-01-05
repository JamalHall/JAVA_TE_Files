package com.techelevator.items;

/*
    This represents a single catering item in the system
 */

public abstract class CateringItem {

    //instance variables
    private String name;
    private double price;
    private int quantity = 25;


    //constructor
    public CateringItem(String name, double price){
        this.name = name;
        this.price = price;


    }

    //getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }
}
