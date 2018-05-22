import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/countingsort3/problem
 * Practice > Algorithms > Sorting > Counting Sort 3
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyCountingSort3 {

	// Complete the countingSort function below.
	static int[] countingSort(int[] arr) {
		final int n = 100;
		List<Integer> interim = new LinkedList<Integer>();
		int[] sortHelper = new int[n];
		int[] result = new int[100];
		for (int i : arr) {
			sortHelper[i]++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = sortHelper[i]; j > 0; j--) {
				interim.add(i);
			}
		}

		for (int i = 0; i < 100; i++) {
			final int x = i;
			result[i] = (int) interim.stream().filter(e -> (e <= x)).count();
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			scanner.nextLine();
		}

		int[] result = countingSort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		scanner.close();
	}
}