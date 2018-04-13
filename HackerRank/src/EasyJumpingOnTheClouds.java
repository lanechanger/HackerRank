import java.util.Scanner;
/*https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
Practice > Algorithms > Implementation > Jumping on the Clouds: Revisited
by Jeremy Ng (lanechanger)*/

public class EasyJumpingOnTheClouds {
	static int jumpingOnClouds(int[] c, int k) {
		// Complete this function
		int n = c.length;
		int result = 100;
		int pos = 0;
		do {
			pos = (pos + k) % n;
			result = (c[pos] == 0) ? result - 1 : result - 3;
		} while (pos != 0);
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] c = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int result = jumpingOnClouds(c, k);
		System.out.println(result);
		in.close();
	}
}
