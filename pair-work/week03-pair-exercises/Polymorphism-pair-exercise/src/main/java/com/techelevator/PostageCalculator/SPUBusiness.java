package com.techelevator.PostageCalculator;

public class SPUBusiness implements DeliveryDriver {

    public String toString(){
        return "SPU (2-Day Business)";
    }

    // Convert ounces to pounds per readme
    @Override
    public double calculateRate(int distance, double weight) {
        double pounds = weight / 16;
        return (pounds * 0.050) * distance;
    }
}
