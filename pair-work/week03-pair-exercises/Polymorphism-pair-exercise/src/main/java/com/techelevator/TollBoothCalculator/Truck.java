package com.techelevator.TollBoothCalculator;

import java.util.Scanner;


public class Truck implements Vehicle {

    public int numberOfAxles;

    //Constructor
    public Truck(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {

    }




    public int getNumberOfAxles() {

        // User input for number of axles
        Scanner axleScanner = new Scanner(System.in);
        // parse input to integer
        System.out.println("Does this truck have 4 6 or more than 8 axles? ");
        // assign to variable called axles
        int axles = Integer.parseInt(axleScanner.nextLine());
        numberOfAxles = axles;
        return numberOfAxles;
    }



    @Override
    public double calculateToll(int distance) {
        int num = getNumberOfAxles();
        double tollFee = 0.0;
        if (num == 4) {
            tollFee = distance * 0.04;
        } else if (num == 6) {
            tollFee = distance * 0.045;
        } else if (num >= 8 ) {
            tollFee = distance * 0.048;
        } else {
            System.out.println("Invalid number of axles 8 axle rate assigned");
            tollFee = distance * 0.048;
        }
        return tollFee;
    }
}
