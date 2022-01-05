package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

    public static void main(String[] args) {
        // Create scanner to take in user input
        Scanner userInput = new Scanner(System.in);

        // Created needed variables to store user input
        double weight;
        int distance;

        // Create a list and objects to go in the list
        List<DeliveryDriver> deliveryTypes = new ArrayList<DeliveryDriver>();
        PostalService1st postalFirst = new PostalService1st();
        PostalService2nd postalSecond = new PostalService2nd();
        PostalService3rd postalThird = new PostalService3rd();
        FexEd fexEd = new FexEd();
        SPUGround spuGround = new SPUGround();
        SPUBusiness spuBusiness = new SPUBusiness();
        SPUNext spuNext = new SPUNext();

        // Add delivery types to list
        deliveryTypes.add(postalFirst);
        deliveryTypes.add(postalSecond);
        deliveryTypes.add(postalThird);
        deliveryTypes.add(fexEd);
        deliveryTypes.add(spuGround);
        deliveryTypes.add(spuBusiness);
        deliveryTypes.add(spuNext);

        // Create scanner to take in/ out user info
        System.out.println("Please enter the weight of the package? ");
        weight = userInput.nextInt();
        userInput.nextLine();
        System.out.println("(P)ounds or (O)unces? ");
        while (true) {
            String weightType = userInput.nextLine();
            //If put in pounds convert to ounces
            if (weightType.equalsIgnoreCase("P")) {
                weight *= 16.0;
                break;
            }
            else if (weightType.equalsIgnoreCase("O")){
                break;
            }
            else{
                System.out.println("Entry error, please try again");
            }
        }
        System.out.println("What distance will it be traveling?");
        distance = userInput.nextInt();
        userInput.nextLine();

        System.out.print("\n");

        // format fof loop to return a table
        // Header per readme
        System.out.println(String.format("%-30s","Delivery Method") + String.format("%-8s", "$ cost"));
        for (int i=0; i <= 34; i++){
            System.out.print("-");
        }

        // Returning the memory location name in the label instead of the location of memory
        // Returning the cost of each delivery type in a table
        System.out.print("\n");
        for (DeliveryDriver type : deliveryTypes){
            System.out.println(String.format("%-30s", type.toString()) + "$" + String.format("%.2f",type.calculateRate(distance, weight)));
        }
    }
}
