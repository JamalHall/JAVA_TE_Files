package com.techelevator;

public class TriangleWall extends Wall{
    private int base;
    private int height;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color); //why did super work here and not in square
        this.base = base;
        this.height = height;
    }


    public String toString(){
        return getName() + " " + "(" + base + "x" + height + ")" + " triangle"; //why could i use variable names anf not getters here
    }

    @Override
    public int getArea() {
        return base*height/2;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
