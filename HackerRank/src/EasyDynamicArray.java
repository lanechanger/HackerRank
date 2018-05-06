import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 * Practice > Data Structures > Arrays > Dynamic Array
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyDynamicArray {
	/*
	 * Complete the dynamicArray function below.
	 */
	static int[] dynamicArray(int n, int[][] queries) {
		/*
		 * Write your code here.
		 */
		ArrayList<Integer>[] sequences = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			sequences[i] = new ArrayList<Integer>();
		}
		int lastAnswer = 0;
		int seq;
		List<Integer> result = new LinkedList<>();

		for (int i = 0; i < queries.length; i++) {
			seq = sequencer(queries[i][1], lastAnswer, n);
			if (queries[i][0] == 1) {
				sequences[seq].add(queries[i][2]);
			} else {
				lastAnswer = sequences[seq].get(queries[i][2] % sequences[seq].size());
				result.add(lastAnswer);
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	static int sequencer(int a, int b, int N) {
		return ((a ^ b) % N);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nq = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nq[0].trim());

		int q = Integer.parseInt(nq[1].trim());

		int[][] queries = new int[q][3];

		for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");

			for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
				int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
				queries[queriesRowItr][queriesColumnItr] = queriesItem;
			}
		}

		int[] result = dynamicArray(n, queries);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bufferedWriter.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
