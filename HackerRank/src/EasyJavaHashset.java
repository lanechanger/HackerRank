import java.util.HashSet;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-hashset/problem
 * Practice > Java > Data Structures > Java Hashset
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyJavaHashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			set.add(pair_left[i].concat("_").concat(pair_right[i]));
			System.out.println(set.size());
		}
	}
}
