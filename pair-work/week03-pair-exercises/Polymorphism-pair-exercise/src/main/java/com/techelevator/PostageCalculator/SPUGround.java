package com.techelevator.PostageCalculator;

public class SPUGround implements DeliveryDriver {

    public String toString(){
        return "SPU (4 Day Ground)";
    }

    // Convert ounces to pounds per readme
    @Override
    public double calculateRate(int distance, double weight) {
        double pounds = weight / 16;

        return (pounds * 0.0050) * distance;
    }
}
