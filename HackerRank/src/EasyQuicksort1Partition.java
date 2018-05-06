import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/quicksort1/problem
 * Practice > Algorithms > Sorting > Quicksort 1 - Partition
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyQuicksort1Partition {
    static int[] quickSort(int[] arr) {
        // Complete this function
		int p = arr[0];
		LinkedList<Integer> left = new LinkedList<>();
		LinkedList<Integer> right = new LinkedList<>();
		LinkedList<Integer> mid = new LinkedList<>();
		for (int i : arr) {
			if (i < p) {
				left.add(i);
			} else if (i > p) {
				right.add(i);
			} else {
				mid.add(i);
			}
		}
		left.addAll(mid);
		left.addAll(right);
		return left.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
