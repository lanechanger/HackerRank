import java.util.Scanner;
/*https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
Practice > Algorithms > Implementation > Breaking The Records
by Jeremy Ng (lanechanger)*/

public class EasyBreakingTheRecords {

	static int[] breakingRecords(int[] score) {
		// Complete this function
		int[] records = new int[2];
		int max = score[0];
		int min = score[0];

		for (int curr = 1; curr < score.length; curr++) {
			if (score[curr] > max) {
				max = score[curr];
				records[0]++;
			}

			if (score[curr] < min) {
				min = score[curr];
				records[1]++;
			}
		}

		return records;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
