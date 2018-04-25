import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 * Practice > Java > Data Structures > Java Arraylist
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyJavaArraylist {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<ArrayList<Integer>> result = new ArrayList<>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> curr = new ArrayList<>();
			int d = in.nextInt();
			for (int j = 0; j < d; j++) {
				curr.add(in.nextInt());
			}
			result.add(curr);
		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			try {
				ArrayList<Integer> curr = result.get(in.nextInt() - 1);
				System.out.println(curr.get(in.nextInt() - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

		in.close();
	}

}
