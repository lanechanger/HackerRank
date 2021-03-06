import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 * Practice > Algorithms > Implementation > Jumping on the Clouds: Revisited
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyJumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {
		// Complete this function
		int results = 0;
		for (int i = 0; i < c.length - 1;) {
			// always try to jump by 2 if possible
			if ((i + 2 < c.length) && (c[i + 2] == 0)) {
				i += 2;

			} else {
				i++;
			}
			results++;
		}
		return results;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int result = jumpingOnClouds(c);
		System.out.println(result);
		in.close();
	}
}
