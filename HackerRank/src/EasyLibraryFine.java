import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/library-fine/problem
 * Practice > Algorithms > Implementation > Library Fine
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyLibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Complete this function
		int result = 0;

		if (y1 == y2) {
			if (m1 > m2) {
				result = 500 * (m1 - m2);
			} else if (m1 == m2) {
				if (d1 > d2) {
					result = 15 * (d1 - d2);
				}
			}
		} else if (y1 > y2) {
			result = 10000;
		}

		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        in.close();
    }
}
