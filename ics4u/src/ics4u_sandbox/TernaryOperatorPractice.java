package ics4u_sandbox;

public class TernaryOperatorPractice {

	public static void main(String[] args) {

		int t1 = 5;
		int t2 = 6;
		int t3 = 4;

		int t4 = t1 <= t2 ? t1 <= t3 ? t1 : t3 : t2 <= t3 ? t2 : t3;

		System.out.println(t4);

	}

}