import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/quicksort3/problem
 * Quicksort In-Place
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class MedQuickSortInPlace {
	static void quicksort(int[] ar, int beg, int end) {
		if (beg < end) {
			int part = partition(ar, beg, end);
			quicksort(ar, beg, part - 1);
			quicksort(ar, part + 1, end);
		}
	}

	static int partition(int[] ar, int beg, int end) {
		int pivot = ar[end];
		int i = beg - 1;
		int temp;
		for (int j = beg; j < end; j++) {
			if (ar[j] < pivot) {
				temp = ar[j];
				ar[j] = ar[++i];
				ar[i] = temp;
			}
		}
		temp = ar[++i];
		ar[i] = pivot;
		ar[end] = temp;

		for (int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();

		return i;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		input.close();

		quicksort(arr, 0, arr.length - 1);
	}
}
