package com.techelevator.TollBoothCalculator;

import java.util.Scanner;

public class Car implements Vehicle {

    // Declared instance variable
    public boolean hasTrailer;

    // Constructor

    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public Car() {

    }

    public boolean getHasTrailer() {
        // user input for trailer y or n
        Scanner trailScanner = new Scanner(System.in);
        // char.toLowerCase()
        System.out.println("Does this car have a trailer? Y or N ");
        // y = true, n = false for hasTrailer
        String trailer = trailScanner.nextLine();
        char yesOrNo = trailer.toLowerCase().charAt(0);
        char y = 'y';
        char n = 'n';

        if (yesOrNo == y) {
            hasTrailer = true;
        } else if (yesOrNo == n) {
            hasTrailer = false;
        }
        return hasTrailer;
    }


    @Override
    public double calculateToll(int distance) {
        double tollFee = (getHasTrailer()) ? distance * 0.02 + 1.00 : distance * 0.02;
        return tollFee;
    }
}
