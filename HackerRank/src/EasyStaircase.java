import java.util.Scanner;
/*https://www.hackerrank.com/challenges/staircase/problem
Practice > Algorithms > Warmup > Staircase
by Jeremy Ng (lanechanger)*/

public class EasyStaircase {
	static void staircase(int n) {
        // Complete this function
		// Input Format
		//
		// A single integer, , denoting the size of the staircase.
		//
		// Output Format
		//
		// Print a staircase of size using # symbols and spaces.
		//
		// Note: The last line must have spaces in it.
		for (int floor = 0; floor < n; floor++) {
			int spaces = n - floor - 1;
			int stairs = n - spaces;

			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}

			for (int j = 0; j < stairs; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
