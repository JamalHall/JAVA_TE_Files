package com.techelevator;

public class RectangleWall extends Wall{

    //instance variables
    private int length;
    private int height;


    // constructor
    public RectangleWall(String name, String color, int length, int height){
       super(name, color);
        this.length=length;
        this.height=height;
    }

    public RectangleWall() { //why??
        super();
    }

    @Override
    public int getArea() {
        return length*height;
    }

    public String toString(){
        return getName() + " " + "(" + getLength() + "x" + getHeight() + ")" + " rectangle";
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
