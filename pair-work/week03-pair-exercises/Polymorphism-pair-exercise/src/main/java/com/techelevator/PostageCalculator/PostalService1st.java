package com.techelevator.PostageCalculator;

public class PostalService1st implements DeliveryDriver {

    // Labels class name so that it doesn't point to a part in memory
    public String toString(){
        return "Postal Service (1st Class)";
    }

    // Converted all pounds into ounces
    @Override
    public double calculateRate(int distance, double weight) {

        double rate = 0.00;

        if (weight >= 0 && weight < 3) {
            rate = 0.035 * distance;
        } else if (weight >= 3 && weight < 9) {
            rate = 0.040 * distance;
        } else if (weight >= 9 && weight < 16) {
            rate = 0.047 * distance;
        } else if (weight >= 16  && weight < 64) {
            rate = 0.0195 * distance;
        } else if (weight >= 64 && weight < 144) {
            rate = 0.450 * distance;
        } else if (weight >= 144) {
            rate = 0.035 * distance;
        } else {
            System.out.println("Error");
        }
        //output will be rate
        return rate;
    }
}
