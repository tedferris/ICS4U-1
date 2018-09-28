package methods_exercises;

import java.util.Scanner;

public class Question_2 {

	public static double average(int num1, int num2, int num3) { // This method takes three int parameters, averages
																	// them and returns the average as a double.

		double avgnum = ((num1 + num2 + num3) / 3); // Adds the numbers and divides by three, the number of parameters.

		return avgnum; // Returns the average of the three numbers.
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
		int num3 = sc.nextInt(); // Initializes a variable to store the third input.
		System.out.println(""); // Blank line for formatting.

		double output = average(num1, num2, num3); // Passes the three user inputs to the 'average' method and stores
													// the return as the double 'output'.

		System.out.println("The average value is " + output); // Outputs the above double with proper formatting.

		sc.close(); // Closes the scanner.
	}
}
