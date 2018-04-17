import java.util.Scanner;
/*https://www.hackerrank.com/challenges/append-and-delete/problem
Practice > Algorithms > Implementation > Append and Delete
by Jeremy Ng (lanechanger)*/

public class EasyAppendAndDelete {
	static String appendAndDelete(String s, String t, int k) {
		// Complete this function
		// see accompanying analysis .jpeg in resource folder
		String result = "Yes";
		int sSize = s.length();
		int tSize = t.length();

		if (k >= sSize + tSize) {
			// k is large enough to wipe out s entirely to rebuild t
			return result;
		} else {
			int current = 0;
			for (; current < Math.min(sSize, tSize); current++) {
				// find the first character that's not the same
				if (s.charAt(current) != t.charAt(current)) {
					break;
				}
			}

			int difference = (sSize - current) + (tSize - current);
			if ((k < difference) || ((k > difference) && (((k - difference) % 2) != 0))) {
				result = "No";
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		String result = appendAndDelete(s, t, k);
		System.out.println(result);
		in.close();
	}
}
