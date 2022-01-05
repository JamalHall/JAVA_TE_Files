package com.techelevator;

public class FlowerShopOrder implements Order {
    //instance variables
    private String bouquetType;
    private int numberOfRoses;

//constructor
    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

//default constructor
    public FlowerShopOrder() {    }

    // delivery Charge Calculation method
    double deliveryCharge =0.00;

    public double deliveryType(int zipCode, boolean sameDayDelivery){
        if (sameDayDelivery == true && zipCode >=20000 && zipCode<=29999){
            deliveryCharge = 3.99 + 5.99;
        } else if (sameDayDelivery == true && zipCode >=30000 && zipCode<=39999){
            deliveryCharge = 6.99 +5.99;
        } else if (sameDayDelivery == true && zipCode >=10000 && zipCode<=19999) {
            deliveryCharge = 0;
        } else deliveryCharge = 19.99;
        return deliveryCharge;
    }


    @Override
    public int subTotal() {

        return 0;
    }
} //Bak account Class
