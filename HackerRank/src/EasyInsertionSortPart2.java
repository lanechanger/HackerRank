import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/insertionsort2/problem
 * Practice > Algorithms > Sorting > Insertion Sort - Part 2
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyInsertionSortPart2 {
    static void insertionSort2(int n, int[] arr) {
        // Complete this function
		if (n == 1) {
			System.out.println(arr[0]);
		} else {
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j > 0; j--) {
					if (arr[j - 1] <= arr[j]) {
						break;
					} else {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
				printArray(arr);
			}
    	}
    }

	private static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
