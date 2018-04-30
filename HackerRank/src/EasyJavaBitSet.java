import java.util.BitSet;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-bitset/problem
 * Practice > Java > Data Structures > Java Bitset
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */


public class EasyJavaBitSet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		BitSet set1 = new BitSet(n);
		BitSet set2 = new BitSet(n);
		BitSet[] sets = new BitSet[2];
		sets[0] = set1;
		sets[1] = set2;

		for (int i = 0; i < m; i++) {
			String op = in.next();
			int oper1 = in.nextInt();
			int oper2 = in.nextInt();

			switch (op) {
			case "AND":
				sets[oper1 - 1].and(sets[oper2 - 1]);
				break;
			case "OR":
				sets[oper1 - 1].or(sets[oper2 - 1]);
				break;
			case "XOR":
				sets[oper1 - 1].xor(sets[oper2 - 1]);
				break;
			case "FLIP":
				sets[oper1 - 1].flip(oper2);
				break;
			case "SET":
				sets[oper1 - 1].set(oper2);
				break;
			}

			System.out.println(set1.cardinality() + " " + set2.cardinality());
		}
	}
}
