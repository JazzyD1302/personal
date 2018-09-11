package personal; 

import java.util.Scanner;

public class RollDie {
	static String RollAgain;

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Rolldie();

	}

	private static void Rolldie() {
		int SIDES = 18; // how many sides on the die?
		// roll should be 1 through SIDES
		int roll = (int) (Math.random() * SIDES) + 1;
		// print result
		System.out.println("entre roll to roll");
		if (in.hasNext("roll")) {
			System.out.println(roll);
			in.nextLine();

		Rolldie();
	}
}
}