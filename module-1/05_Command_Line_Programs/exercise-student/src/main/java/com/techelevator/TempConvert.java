package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Is the measurement in (C)elsius, or (F)ahreneit?");
		String userMeasurementSys = userInput.nextLine();
		System.out.println("Please enter the temperature: ");

		double userTemp = Double.parseDouble(userInput.nextLine());

		String returnMeasurement="";
		if(userMeasurementSys.equals("c")||  userMeasurementSys.equals("C")) {
			float calculatedTemp = (float) (userTemp * 1.8 + 32);
			returnMeasurement= "The Temperature in Fahrenheit is " + Float.toString(calculatedTemp);
		} else if(userMeasurementSys.equals("f")||  userMeasurementSys.equals("F")){
			float calculatedTemp = (float) ((userTemp - 32) / 1.8);
			returnMeasurement= "The Temperature in Celsius is " + Float.toString(calculatedTemp);
		} else {
			System.out.println("Invalid restart");
		}
		System.out.println(returnMeasurement);






	}

}
