import java.util.BitSet;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/acm-icpc-team/problem
 * Practice > Algorithms > Implementation > ACM ICPC Team
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyAcmIcpcTeam {
	static int[] acmTeam(String[] topic) {
        // Complete this function
		int[] results = new int[2];

		for (int i = 0; i < topic.length - 1; i++) {
			BitSet first = toBitSet(topic[i]);
			for (int j = i + 1; j < topic.length; j++) {
				BitSet second = toBitSet(topic[j]);
				second.or(first);
				int current = second.cardinality();
				if (current > results[0]) {
					// new record, reset # of max's found
					results[0] = current;
					results[1] = 1;
				} else if (current == results[0]) {
					// found another team that matches the max
					results[1]++;
				}
			}
		}

		return results;
	}

	static BitSet toBitSet(String s) {
		int size = s.length();
		byte[] bytes = new byte[size];
		for (int i = 0; i < size; i++) {
			bytes[i] = (s.charAt(i) == '1') ? (byte) 1 : 0;
		}
		return BitSet.valueOf(bytes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
		int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
