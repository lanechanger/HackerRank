import java.util.Scanner;
/*https://www.hackerrank.com/challenges/sherlock-and-squares/problem
Practice > Algorithms > Implementation > Sherlock and Squares
by Jeremy Ng (lanechanger)*/

public class EasySherlockAndSquares {
	static int squares(int a, int b) {
		// Complete this function
		return ((int) Math.floor(Math.sqrt(b))) - ((int) Math.ceil(Math.sqrt(a))) + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int result = squares(a, b);
			System.out.println(result);
		}
		in.close();
	}
}
