import java.util.Arrays;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/the-hurdle-race/problem
Practice > Algorithms > Implementation > The Hurdle Race
by Jeremy Ng (lanechanger)*/

public class EasyHurdleRace {
	static int hurdleRace(int k, int[] height) {
		// Complete this function
		int maxHeight = Arrays.stream(height).max().getAsInt();
		return (k >= maxHeight) ? 0 : maxHeight - k;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}
}
