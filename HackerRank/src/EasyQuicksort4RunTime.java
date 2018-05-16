import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/quicksort4/problem
 * Running Time of Quicksort
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyQuicksort4RunTime {
	static int quicksort(int[] ar, int beg, int end) {
		int swaps = 0;
		if (beg < end) {
			int[] part = partition(ar, beg, end);
			swaps = part[1] + quicksort(ar, beg, part[0] - 1) + quicksort(ar, part[0] + 1, end);
		}
		return swaps;
	}

	static int[] partition(int[] ar, int beg, int end) {
		int pivot = ar[end];
		int[] result = new int[2];
		result[0] = beg - 1;
		int temp;
		for (int j = beg; j < end; j++) {
			if (ar[j] < pivot) {
				temp = ar[j];
				ar[j] = ar[++result[0]];
				ar[result[0]] = temp;
				result[1]++;
			}
		}
		temp = ar[++result[0]];
		ar[result[0]] = pivot;
		ar[end] = temp;
		result[1]++;

		return result;
	}

	static int insertSortRunningTime(int[] A) {
		// Complete this function
		int results = 0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
				results++;
			}
			A[j + 1] = value;
		}

		return results;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			int next = input.nextInt();
			arr[i] = next;
			arr2[i] = next;
		}
		input.close();

		System.out.println(insertSortRunningTime(arr2) - quicksort(arr, 0, arr.length - 1));
	}
}
