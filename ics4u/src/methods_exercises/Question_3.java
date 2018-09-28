package methods_exercises;

import java.util.Scanner;

public class Question_3 {

	public static char[] middlechars(char a, char b) { // This method takes two char parameters, and returns all the
														// characters in between. This is why the return type is a char
														// array.

		char[] output = new char[b - a]; // Our output array will be a char array whose size is simply the difference
											// between the two char parameters. This line also casts the char parameters
											// to ints. This will be very helpful later.

		int index = 0; // This will be our array traversal variable (see below 'for' loop).

		for (int i = a + 1; i < b; i++, index++) { // This 'for loop' will assign the first value to the ASCII character
													// above the first parameter, and increment by one until it reaches
													// the second parameter (exclusive).

			output[index] = (char) i; // Casts the int value of 'i' to a char and stores it at the appropriate index.
		}

		return (output); // Now we return our filled char array.

	}

	public static void output(char[] a) { // This is our output method. It contains the logic to properly format our
											// output.

		for (int x = 0; x < a.length; x++) { // This will put a space between each character, and ensure that there are
												// at most 20 per line.

			System.out.print(a[x] + " "); // Output the first element, then put a space in.

			if ((x + 1) % 20 == 0) { // If our array index variable is at 19, then we are at the 20th element,
										// meaning we must move to a new line.

				System.out.println(); // This is our new line.

			}

		}
	}

	public static void main(String[] args) { // Main method

		Scanner sc = new Scanner(System.in); // Scanner to recieve input.

		System.out.print("Input from character: "); // Prompts user for first char.
		char char1 = sc.next().charAt(0); // Scanner to receive first char.
		System.out.println(""); // Blank line for formatting.

		System.out.print("Input to character: "); // Prompts user for second char.
		char char2 = sc.next().charAt(0); // Scanner to receive first char.
		System.out.println(""); // Blank line for formatting.

		char[] answer = middlechars(char1, char2); // Calls our calculating method, passing the two char inputs as
													// parameters.

		output(answer); // Passes our char array as a parameter for our output method, which handles the
						// output to console.

		sc.close(); // Closes the scanner.

	}
}
