import java.util.Scanner;
/*https://www.hackerrank.com/challenges/kangaroo/problem
Practice > Algorithms > Implementation > Kangaroo
by Jeremy Ng (lanechanger)*/

public class EasyKangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		// Complete this function
		// Observations: we need to solve for positive integer y where
		// x1 + y*v1 = x2 + y*v2
		// y*(v1 - v2) = x2 - x1
		// y = (x2 - x1) / (v1 - v2)
		// e.g. YES case 0 3 4 2
		// y = (4 - 0) / (3 - 2) = 4 / 1 = 4
		// e.g. NO case [never caught up] 0 2 5 3
		// y = (5 - 0) / (2 - 3) = 5 / -1 = -5
		// e.g. NO case [same speed different starting position] 0 2 1 2
		// y = (1 - 0) / (2 - 2) = 1 / 0 = N/A
		// e.g. NO case [diff. speed but never line up] 0 3 3 1
		// y = (3 - 0) / (3 - 1) = 3 / 2 = 1.5 (not an integer)
		// e.g. NO case [diff. speed but never line up] 1 4 2 2
		// y = (2 - 1) / (4 - 2) = 1 / 2 = 0.5 (not an integer)
		// e.g. NO case [line up but different amount of jumps] 2 1 0 1
		// y = (0 - 2) / (1 - 1) = -2 / 0 = N/A
		// e.g. YES case [same starting position same speed] 1 1 1 1
		// y = (1 - 1) / (1 - 1) = 0 / 0 = N/A but this is a YES case
		// e.g. NO case [same starting position different speed] 1 3 1 2
		// y = (1 - 1) / (3 - 2) = 0 / 1 = 0

		// same speed
		if ((v1 - v2) == 0) {
			// if also same starting position then yes, if no, then they'll never catch up
			return ((x2 - x1) == 0) ? "YES" : "NO";
		} else { // different speed
			// not an integer (diff. speed but never line up)
			if (((int) (((double) (x2 - x1) / (v1 - v2)) * 10)) % 10 != 0) {
				return "NO";
			}

			// negative integer (never syncs up)
			if (((x2 - x1) / (v1 - v2)) <= 0) {
				return "NO";
			}

			// the remaining results are positive integers that is the number of jumps that
			// the 2 kangaroos will line up at
			return "YES";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
}
