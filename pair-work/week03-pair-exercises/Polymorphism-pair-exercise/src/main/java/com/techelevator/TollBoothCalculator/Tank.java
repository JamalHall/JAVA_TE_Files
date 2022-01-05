package com.techelevator.TollBoothCalculator;

public class Tank implements Vehicle {


    @Override
    public double calculateToll(int distance) {
        System.out.println("Tanks are free!");
        double tollFee = distance * 0.0;
        return 0;
    }
}
