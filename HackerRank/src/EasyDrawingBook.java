import java.util.Scanner;
/*https://www.hackerrank.com/challenges/drawing-book/problem
Practice > Algorithms > Implementation > Drawing Book
by Jeremy Ng (lanechanger)*/

public class EasyDrawingBook {
	static int solve(int n, int p) {
		// Complete this function
		// See accompanying jpeg file in resources folder in gitHub for the analysis on
		// developing this O(1) algorithm
		boolean assymetricCases = ((((n - 2) % 4) == 0) || (((n - 2) % 4) == 1));
		// base case
		if (n == 1) {
			return 0;
		} else {
			if ((assymetricCases && (p <= n / 2)) || (!assymetricCases && (p <= (n / 2) + 1))) {
				return (p == 1) ? 0 : (p / 2);
			} else {
				if ((p == n) || (n % 2 == 1 && p == n - 1)) {
					return 0;
				} else {
					return (n % 2 == 0) ? ((n + 1) - p) / 2 : (n - p) / 2;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = solve(n, p);
		System.out.println(result);
	}
}
