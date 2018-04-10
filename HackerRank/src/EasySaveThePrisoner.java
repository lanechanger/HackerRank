import java.util.Scanner;
/*https://www.hackerrank.com/challenges/save-the-prisoner/problem
Practice > Algorithms > Implementation > Save the Prisoner!
by Jeremy Ng (lanechanger)*/

public class EasySaveThePrisoner {
	static int saveThePrisoner(int n, int m, int s) {
		// Complete this function
		// see accompanying analysis .jpeg in resource folder
		return ((s + m - 2) % n) + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			int result = saveThePrisoner(n, m, s);
			System.out.println(result);
		}
	}
}
