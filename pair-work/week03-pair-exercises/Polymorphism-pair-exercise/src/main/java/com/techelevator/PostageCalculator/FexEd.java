package com.techelevator.PostageCalculator;

public class FexEd implements DeliveryDriver {

    public String toString(){
        return "FexEd";
    }


    @Override
    public double calculateRate(int distance, double weight) {
        double rate = 20.00;

        if (distance > 500) {
            rate += 5.00;
        }
        if (weight > 48) {
            rate += 3.00;
        }
        return rate;
    }
}
