import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * https://www.hackerrank.com/challenges/quicksort2/problem
 * Practice > Algorithms > Sorting > Quicksort 2 - Sorting
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyQuicksort2Sorting {
	static List<Integer> partition(List<Integer> arr) {
		// Complete this function
		int p = arr.get(0);
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		List<Integer> mid = new ArrayList<>();
		for (int i : arr) {
			if (i < p) {
				left.add(i);
			} else if (i > p) {
				right.add(i);
			} else {
				mid.add(i);
			}
		}

		if (left.size() > 1) {
			left = partition(left);
		}
		if (right.size() > 1) {
			right = partition(right);
		}

		left.addAll(mid);
		left.addAll(right);
		for (int i : left) {
			System.out.print(i + " ");
		}
		System.out.println();
		return left;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = input.nextInt();
		}

		partition(IntStream.of(ar).boxed().collect(Collectors.toList()));
	}
}
