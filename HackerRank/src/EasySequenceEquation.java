import java.util.HashMap;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/permutation-equation/problem
Practice > Algorithms > Implementation > Sequence Equation
by Jeremy Ng (lanechanger)*/

public class EasySequenceEquation {
	static int[] permutationEquation(int[] p) {
		// Complete this function
		// see accompanying analysis .jpeg in resource folder
		int n = p.length;
		int[] results = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(p[i], i + 1);
		}

		for (int x = 0; x < n; x++) {
			results[x] = map.get(map.get(x + 1));
		}

		return results;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];
		for (int p_i = 0; p_i < n; p_i++) {
			p[p_i] = in.nextInt();
		}
		int[] result = permutationEquation(p);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
