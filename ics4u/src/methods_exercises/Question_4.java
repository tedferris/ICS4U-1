package methods_exercises;

import java.util.Scanner;

public class Question_4 {

	public static int[] count(int givennum) { // This method takes an int parameter, and will count from that number to
		// 10, hence the int array return type.

		int[] output = new int[11 - givennum]; // The reason the int array must be this size is to ensure that there
		// aren't any empty spaces.

		for (int x = 0; x < output.length; x++) { // When x = 0; the element at index 0 will be set to the number passed
			// in.

			output[x] = x + givennum; // The next one will be one greater, and so on, until the array is full.
		}

		return output; // This returns the int array we just filled.
	}

	public static void main(String[] args) { // Main method

		int[] answer = count(1); // This sets the int array 'answer' to whatever our 'count' method returns.

		for (int i = 0; i < answer.length; i++) { // This 'for' loop will format the output properly.

			System.out.print(answer[i] + ", "); // This simply outputs the array that was returned from our 'count'
			// method.

		}
		System.out.println("");

	}

}
