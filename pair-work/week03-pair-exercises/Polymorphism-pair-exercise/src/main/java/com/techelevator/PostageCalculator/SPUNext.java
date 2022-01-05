package com.techelevator.PostageCalculator;

public class SPUNext implements DeliveryDriver {
    public String toString(){
        return "SPU (Next Day)";
    }

    // Convert ounces to pounds per readme
    @Override
    public double calculateRate(int distance, double weight) {
        double pounds = weight / 16;

        return (pounds * 0.075) * distance;
    }
}
