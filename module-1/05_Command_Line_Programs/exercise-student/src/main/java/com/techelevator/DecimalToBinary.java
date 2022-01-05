package com.techelevator;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

//		Write a command line program which prompts the user for a series of decimal integer values separated
//		by spaces. Each decimal integer is displayed along with its equivalent binary value.
//
//		Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
//
//		460 in binary is 111001100
//		8218 in binary is 10000000011010
//		1 in binary is 1
//		31313 in binary is 111101001010001
//		987654321 in binary is 111010110111100110100010110001

		//Smurf
		Scanner userInput = new Scanner(System.in);


		//prompt
		System.out.println("Enter integer number series separated by a space to convert to binary...");
		String userNumbers = userInput.nextLine();

		//formatting and math

		String[] radixArray = userNumbers.split("[, ?.@]+");

		int length = radixArray.length;
		int i = 0;

		while(i<=length-1) {
			int value = Integer.parseInt(radixArray[i]);
			String binaryValue = Integer.toBinaryString(value);

			//output

			System.out.println( radixArray[i]+ " To Binary is: " + binaryValue);
			i++;

		}








	}

}
