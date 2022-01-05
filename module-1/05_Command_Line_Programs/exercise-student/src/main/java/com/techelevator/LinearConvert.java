package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String userMeasurementSys = userInput.nextLine();
		System.out.println("Please enter the length: ");

		double userLength = Double.parseDouble(userInput.nextLine());

		double returnMeasurement=0;
		if(userMeasurementSys.equals("m")||  userMeasurementSys.equals("M")) {
			returnMeasurement = userLength * .3048;
		} else if(userMeasurementSys.equals("f")||  userMeasurementSys.equals("F")){
			returnMeasurement = userLength * 3.2808399;
		} else {
			System.out.println("Invalid restart");
		}
		System.out.println("The measurement in "+userMeasurementSys+" = "+ returnMeasurement);
	}

}
