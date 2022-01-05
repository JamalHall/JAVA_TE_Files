package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
Scanner userInput = new Scanner(System.in);

//parameters
		System.out.println("Enter ending sequence MAX value in integer form");
		int fibMax = Integer.parseInt(userInput.nextLine());
// Math in background
		int startFirst = 0;
		int startNext =1;
		int memory;
		while (startNext <= fibMax) {

			memory = startNext;
			startNext = startNext + startFirst;
			startFirst = memory;
			System.out.println("The sequence is " + startFirst);

		}
// User Return 2
		System.out.println("The final value is " + startFirst);

	}

}
