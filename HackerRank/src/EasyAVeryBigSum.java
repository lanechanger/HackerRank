import java.util.Scanner;
/*https://www.hackerrank.com/challenges/a-very-big-sum/problem
Practice > Algorithms > Warmup > A Very Big Sum
by Jeremy Ng (lanechanger)*/

public class EasyAVeryBigSum {
	static long aVeryBigSum(int n, long[] ar) {
		// Complete this function
		// LongInteger aVeryBigSum(Integer n, LongInteger_array ar) {
		// # Return the sum of all array elements
		// }
		// n: Integer denoting number of array elements
		// ar: Long Integer array with elements whose sum needs to be computed
		long max = 0;
		for (long i : ar) {
			max += i;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ar = new long[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextLong();
		}
		long result = aVeryBigSum(n, ar);
		System.out.println(result);
	}
}
