import java.util.Scanner;
/*https://www.hackerrank.com/challenges/migratory-birds/problem
Practice > Algorithms > Implementation > Migratory Birds
by Jeremy Ng (lanechanger)*/


public class EasyMigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
		// Complete this function
		final int BIRDS = 5;
		int[] all = new int[BIRDS];
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;

		// restructure this potentially massive array
		for (int i = 0; i < n; i++) {
			switch (ar[i]) {
			case 1:
				all[0]++;
				break;
			case 2:
				all[1]++;
				break;
			case 3:
				all[2]++;
				break;
			case 4:
				all[3]++;
				break;
			default:
				all[4]++;
			}
		}

		for (int i = 0; i < BIRDS; i++) {
			if (all[i] > max) {
				max = all[i];
				maxIndex = i;
			}
		}

		return maxIndex + 1;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
        }
		int result = migratoryBirds(n, ar);
		System.out.println(result);
    }
}
