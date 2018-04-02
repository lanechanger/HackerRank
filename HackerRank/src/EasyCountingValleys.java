import java.util.Scanner;
/*https://www.hackerrank.com/challenges/counting-valleys/problem
Practice > Algorithms > Implementation > Counting Valleys
by Jeremy Ng (lanechanger)*/

public class EasyCountingValleys {
	static int countingValleys(int n, String s) {
		// Complete this function
		int currentLevel = 0;
		int valleys = 0;
		for (char c : s.toCharArray()) {
			if (c == 'U') {
				currentLevel++;
				if (currentLevel == 0) {
					// if going up resulted in sea level, then a valley was just traversed
					valleys++;
				}
			} else {
				currentLevel--;
			}
		}
		return valleys;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
