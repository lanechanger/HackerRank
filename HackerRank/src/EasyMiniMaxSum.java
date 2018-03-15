import java.util.Scanner;
/*https://www.hackerrank.com/challenges/mini-max-sum/problem
Practice > Algorithms > Warmup > Mini-Max Sum
by Jeremy Ng (lanechanger)*/

public class EasyMiniMaxSum {

	static void miniMaxSum(int[] arr) {
		// Complete this function
		// Given five positive integers, find the minimum and maximum values that can be
		// calculated by summing exactly four of the five integers. Then print the
		// respective minimum and maximum values as a single line of two space-separated
		// long integers.
		//
		// Input Format
		// A single line of five space-separated integers.
		//
		// Output Format
		// Print two space-separated long integers denoting the respective minimum and
		// maximum values that can be calculated by summing exactly four of the five
		// integers. (The output can be greater than a 32 bit integer.)

		// Figure out where the smallest and largest value in the array is (O(n))
		int minIndex = 0;
		long min = Long.MAX_VALUE;
		int maxIndex = 0;
		long max = Long.MIN_VALUE;
		long minResult = 0;
		long maxResult = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}

			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}

		// and then sum the other 4 numbers for our outputs (O(n))
		for (int i = 0; i < arr.length; i++) {
			if (i != minIndex) {
				maxResult += arr[i];
			}

			if (i != maxIndex) {
				minResult += arr[i];
			}
		}

		System.out.println(minResult + " " + maxResult);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		miniMaxSum(arr);
		in.close();
	}
}
