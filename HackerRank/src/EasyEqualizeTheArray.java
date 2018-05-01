import java.util.HashMap;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 * Practice > Algorithms > Implementation > Equalize the Array
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyEqualizeTheArray {
	static int equalizeArray(int[] arr) {
		// Complete this function
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(Integer.valueOf(arr[i]))) {
				int curr = map.get(arr[i]) + 1;
				map.put(arr[i], curr);
				if(curr > max) {
					max = curr;
				}
			} else {
				map.put(arr[i], 1);
			}
		}

		return arr.length - max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = equalizeArray(arr);
		System.out.println(result);
		in.close();
	}
}
