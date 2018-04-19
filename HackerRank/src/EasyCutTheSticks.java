import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * Practice > Algorithms > Implementation > Cut The Sticks
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyCutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        // Complete this function
    	ArrayList<Integer>results = new ArrayList<>();
    	Arrays.sort(arr);
    	int currentMin = 0;

		while (currentMin < arr.length) {
			int min = arr[currentMin];
			results.add((int) Arrays.stream(arr).filter(x -> x >= min).count());
			currentMin += Arrays.stream(arr).filter(x -> x == min).count();
		}

		return results.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
