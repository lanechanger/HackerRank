import java.io.IOException;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
Practice > Algorithms > Implementation > Cats and a Mouse
by Jeremy Ng (lanechanger)*/

public class EasyCatsAndAMouse {
	/*
	 * Complete the catAndMouse function below.
	 */
	static String catAndMouse(int x, int y, int z) {
		/*
		 * Write your code here.
		 */
		// take the difference between the mouse and either cat, and the closer cat wins
		int deltaXZ = Math.abs(x - z);
		int deltaYZ = Math.abs(y - z);

		if (deltaXZ == deltaYZ) {
			return "Mouse C";
		} else {
			return (deltaXZ < deltaYZ) ? "Cat A" : "Cat B";
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int q = in.nextInt();

		for (int qItr = 0; qItr < q; qItr++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();

			System.out.println(catAndMouse(x, y, z));
		}
	}
}
