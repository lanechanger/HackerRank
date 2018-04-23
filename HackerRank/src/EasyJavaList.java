import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-list/problem
 * Practice > Java > Data Structures > Java List
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyJavaList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> result = new LinkedList<>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			result.add(in.nextInt());
		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			if (in.next().equals("Insert")) {
				result.add(in.nextInt(), in.nextInt());
			} else {
				result.remove(in.nextInt());
			}
		}

		result.stream().forEach(e -> System.out.printf("%d ", e));
		in.close();
	}

}
