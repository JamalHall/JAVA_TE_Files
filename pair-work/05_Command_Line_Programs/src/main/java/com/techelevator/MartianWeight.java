package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 // complete
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		Scanner userInput= new Scanner(System.in);


		System.out.println("Enter your Earth weight1 ");
		double weight1 =Double.parseDouble(userInput.nextLine());
		System.out.println("Enter your Earth weight2 ");
		double weight2 =Double.parseDouble(userInput.nextLine());
		System.out.println("Enter your Earth weight3 ");
		double weight3 =Double.parseDouble(userInput.nextLine());


		double marsFactor = .378;
		weight1 *= marsFactor;
		weight2 *= marsFactor;
		weight3 *= marsFactor;


		System.out.println("Your Mars first weight is " + Math.ceil(weight1) + "lbs");
		System.out.println("Your Mars second weight is " + Math.ceil(weight2) + "lbs");
		System.out.println("Your Mars third weight is " + Math.ceil(weight3) + "lbs");







	}

}
