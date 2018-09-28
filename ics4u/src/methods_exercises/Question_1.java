package methods_exercises;

import java.util.Scanner;

public class Question_1 {

	public static double smallest(int num1, int num2, int num3) { // This method takes three integers as parameters and
																	// returns the lowest as a double value.

		double lowestnum = Math.min(Math.min(num1, num2), num3); // This finds the smallest of the three parameters.

		return lowestnum; // Returns the double value calculated above.
	}

	public static void main(String[] args) { // Main method

		Scanner sc = new Scanner(System.in); // Scanner initialization

		System.out.print("Input the first number: "); // Prompts the user for the first number.
		int num1 = sc.nextInt(); // Initializes a variable to store the first input.
		System.out.println(""); // Blank line for formatting.

		System.out.print("Input the second number: "); // Prompts the user for the second number.
		int num2 = sc.nextInt(); // Initializes a variable to store the second input.
		System.out.println(""); // Blank line for formatting.

		System.out.print("Input the third number: "); // Prompts the user for the third number.
		int num3 = sc.nextInt(); // Initializes a variable to store the third1 input.
		System.out.println(""); // Blank line for formatting.

		double output = smallest(num1, num2, num3); // Calls the 'smallest' method and declares 'output' as the return.

		System.out.println("The smallest value is " + output); // Outputs the answer will proper formatting.

		sc.close(); // Closes the scanner.
	}
}
