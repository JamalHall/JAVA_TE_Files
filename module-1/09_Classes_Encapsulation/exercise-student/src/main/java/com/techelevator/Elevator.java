package com.techelevator;

public class Elevator {
//instance variables
    public	int	currentFloor;
    public	int	numberOfFloors;
    public	boolean	doorOpen;

    //constructor
    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
        this.doorOpen = false;
    }

    //methods
    public void openDoor(){
        this.doorOpen = true;
    }

    public void closeDoor(){
        this.doorOpen = false;

    }

    public void goUp(int desiredFloor){
        this.currentFloor= (doorOpen==false && currentFloor<numberOfFloors)?desiredFloor : currentFloor;
    }

    public void goDown(int desiredFloor){
        this.currentFloor= (doorOpen==false && currentFloor>1)?desiredFloor : currentFloor;
    }


    //getters
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
