import java.util.Scanner;
/*https://www.hackerrank.com/challenges/circular-array-rotation/problem
Practice > Algorithms > Implementation > Circular Array Rotation
by Jeremy Ng (lanechanger)*/

public class EasyCircularArrayRotation {
	static int[] circularArrayRotation(int[] a, int k, int[] m) {
		// Complete this function
		// see accompanying analysis .jpeg in resource folder
		int q = m.length;
		int n = a.length;
		int newK = k % n;
		int[] result = new int[q];
		for (int i = 0; i < q; i++) {
			result[i] = a[(m[i] - newK + n) % n];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] m = new int[q];
		for (int m_i = 0; m_i < q; m_i++) {
			m[m_i] = in.nextInt();
		}

		int[] result = circularArrayRotation(a, k, m);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
