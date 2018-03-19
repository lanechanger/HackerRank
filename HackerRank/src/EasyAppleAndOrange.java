import java.util.Scanner;
/*https://www.hackerrank.com/challenges/apple-and-orange/problem
Practice > Algorithms > Implementation > Apple and Orange
by Jeremy Ng (lanechanger)*/

public class EasyAppleAndOrange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		// Complete this function
		int happles = 0;
		int horanges = 0;

		for (int currApp : apples) {
			int appDist = a + currApp;
			if (appDist >= s && appDist <= t) {
				happles++;
			}
		}

		for (int currOrg : oranges) {
			int orgDist = b + currOrg;
			if (orgDist >= s && orgDist <= t) {
				horanges++;
			}
		}

		System.out.println(happles + "\n" + horanges);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}
}