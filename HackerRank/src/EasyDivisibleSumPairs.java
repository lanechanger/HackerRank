import java.util.Scanner;
/*https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
Practice > Algorithms > Implementation > Divisible Sum Pairs
by Jeremy Ng (lanechanger)*/

public class EasyDivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		// Complete this function
		int result = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					result++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
