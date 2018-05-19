import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/countingsort2/problem
 * Practice > Algorithms > Sorting > Counting Sort 2
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyCountingSort2 {

	// Complete the countingSort function below.
	static int[] countingSort(int[] arr) {
		final int n = 100;
		List<Integer> result = new LinkedList<Integer>();
		int[] sortHelper = new int[n];
		for (int i : arr) {
			sortHelper[i]++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = sortHelper[i]; j > 0; j--) {
				result.add(i);
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] result = countingSort(arr);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}