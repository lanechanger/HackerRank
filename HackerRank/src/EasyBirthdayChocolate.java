import java.util.Scanner;
/*https://www.hackerrank.com/challenges/the-birthday-bar/problem
Practice > Algorithms > Implementations > Birthday Chocolate
by Jeremy Ng (lanechanger)*/

public class EasyBirthdayChocolate {
	static int solve(int n, int[] s, int d, int m) {
		// Complete this function
		int result = 0;

		if (n < m) {
			// if there are fewer chocolates than the birthday's month then instantly fail
			return result;
		}

		int sum;
		// the main loop will only run (n - m) + 1 times
		// e.g. n = m case: 12 - 12 + 1 = 1 times
		// n > m case: 12 - 11 + 1 = 2 times
		// 1: xxxxxxxxxxxo
		// 2: oxxxxxxxxxxx
		for (int i = 0; i < (n - m) + 1; i++) {
			sum = 0;
			// the secondary loop will start from i and loop m times
			for (int j = i; j < (m + i); j++) {
				sum += s[j];
			}

			if (sum == d) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}
}
