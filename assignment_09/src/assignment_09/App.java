package assignment_09;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Given 2 positive int arguments (a, b), return whichever argument is
	 * nearest to the number 21 without going over.
	 * Return 0 if they both go over 21.
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * nearestTwentyOne(19, 21) <b>---></b> 21 <br>
	 * nearestTwentyOne(21, 19) <b>---></b> 21 <br>
	 * nearestTwentyOne(19, 22) <b>---></b> 19 <br>
	 * nearestTwentyOne(32, 22) <b>---></b> 0 <br>
	 */

	public static int nearestTwentyOne(int a, int b) {
		int val;

		if (a > 21 && b > 21) {
			val = 0;
		} else if (a == 21) {
			val = a;
		} else if (b == 21) {
			val = b;
		} else if (a > 21) {
			val = b;
		} else if (b > 21) {
			val = a;
		} else {
			val = a > b ? a : b;
		}
		return val;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
