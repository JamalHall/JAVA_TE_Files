package com.techelevator;

public abstract class Wall {
    //instance variables
    private String name;
    private String color;

    //constructor
    public  Wall(String name, String color){
        this.color = color;
        this.name = name;
    }

    public Wall() { //Why ???

    }

    public abstract int getArea(); //did not get sent to other classes

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
