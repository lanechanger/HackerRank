import java.util.Scanner;
/*https://www.hackerrank.com/challenges/birthday-cake-candles/problem
Practice > Algorithms > Warmup > Birthday Cake Candles
by Jeremy Ng (lanechanger)*/

public class EasyBirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar, int tallest) {
		// Complete this function
		int result = 0;
		for (int curr : ar) {
			if (curr == tallest) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		int max = Integer.MIN_VALUE;
		for (int ar_i = 0; ar_i < n; ar_i++) {
			int next = in.nextInt();
			if (next > max) {
				max = next;
			}
			ar[ar_i] = next;
		}
		int result = birthdayCakeCandles(n, ar, max);
		System.out.println(result);
	}
}
