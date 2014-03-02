package com.justin.main;

import java.util.Scanner;

/**
 * @author Justin
 * 
 * Challenge #149 - Disemvoweler
 * 
 * Remove all values from a given string. Output the string
 * without the vowels along with the vowels that were removed
 * 
 */
public class Disemvoweler {

	public static void main(String[] args) {
		new Disemvoweler();
	}

	public Disemvoweler() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input String");
		String input = in.nextLine(); // Take in the input.
		in.close(); // Close the scanner resource once finished with.

		System.out.println(input.replaceAll("[aeoiu ]", ""));
		System.out.println(input.replaceAll("[^aeoiu]", ""));
	}

}
