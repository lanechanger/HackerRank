import java.util.Scanner;

/*https://www.hackerrank.com/challenges/diagonal-difference/problem
Practice > Algorithms > Warmup > Diagonal Difference
by Jeremy Ng (lanechanger)*/

public class EasyDiagonalDifference {

	static int diagonalDifference(int[][] a) {
		// Complete this function
		// integer diagonalDifference(2D_integer_array a) {
		// # Return the absolute difference between the diagonal sums
		// }
		// a: 2D array of elements in the matrix
		int length = a.length;
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		// summing up primary diagonal
		for (int x = 0; x < length; x++) {
			primaryDiagonal += a[x][x];
			secondaryDiagonal += a[x][length - (x + 1)];
		}

		return Math.abs(primaryDiagonal - secondaryDiagonal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}

}
