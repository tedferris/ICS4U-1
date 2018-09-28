package ics4u_sandbox;

public class FindALetter {
	
	public static void main(String[] args) {
		location("");
	}

	public static void location(String word) {

		for (int x = 0; x < word.length(); x++) {

			if (word.charAt(x) == 'a') {

				System.out.println(x);
				break;
			}
		}
	}

}
