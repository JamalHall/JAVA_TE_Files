package com.techelevator.TollBoothCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class TollCalculator {

    public static void main(String[] args) {

        // Data Structures list array
        ArrayList<String> vehicle = new ArrayList<String>();
        ArrayList<Integer> vehicleDistance = new ArrayList<Integer>(); // added array list for distances
        ArrayList<Integer> truckAxels = new ArrayList<Integer>();  // added array list for axles
        ArrayList<String> withTrailer = new ArrayList<String>();
        ArrayList<BigDecimal> tollTotals = new ArrayList<BigDecimal>();

        Scanner autobots = new Scanner(System.in);

        // User input
        System.out.println("Enter total number of vehicles: ");
        int totalV = Integer.parseInt(autobots.nextLine());
        int count = totalV;

        // Sort vehicles
        for (; count > 0; count--) {
            System.out.println("Enter vehicle type: Car, Truck, or Tank ");
            String vType = autobots.nextLine();
            vType = vType.toLowerCase();
            vehicle.add(vType);


            // Toll assignment
            double total = 0.0;

            // random number generator
            int distance = (int) (Math.random() * (240 - 10)) + 10;

            // Toll calculation
            if (vType.equals("car")) {
                Car car = new Car();
                int xRand=distance;
                vehicleDistance.add(xRand);
                total += car.calculateToll(xRand);
                String value = (car.hasTrailer == true)? "has" : "no";
                withTrailer.add(value);


            } else if (vType.equals("truck")) {
                Truck truck = new Truck();
                int xRand=distance;
                vehicleDistance.add(xRand);
                total += truck.calculateToll(xRand);
                truckAxels.add(truck.numberOfAxles);


            } else if (vType.equals("tank")) {
                Tank tank = new Tank();
                int xRand=distance;
                vehicleDistance.add(xRand);
                total += tank.calculateToll(xRand);
            }



            BigDecimal dollarsA = new BigDecimal(total); //added big decimal
            BigDecimal dollarsB = dollarsA.setScale(2, RoundingMode.UP); // rounding up to 2 sig digits
            tollTotals.add(dollarsB); //adding toll totals to array list
            System.out.println("total toll $" + dollarsB); //changed this line



        } // end of for loop


        System.out.println("The types are: " + vehicle + " and there are " + totalV + " total." );
        System.out.println("The distances are: " + vehicleDistance);
        System.out.println( "The trucks have " + truckAxels + " number of axles"  );
        System.out.println("Cars trailer statuses:  " + withTrailer );
        System.out.println("Total Tolls are: " + tollTotals );





    }// end of main method
} //end of Tollcalculator Class

