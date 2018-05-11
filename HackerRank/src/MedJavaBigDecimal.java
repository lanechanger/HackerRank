import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
 * Practice > Java > BigNumber > Java BigDecimal
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class MedJavaBigDecimal {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		///////////// locked /////////////
		// Write your code here

		class SpecialBigDecimal {
			private BigDecimal myBigDecimal;
			private String myString;
			private int myOrder;

			SpecialBigDecimal(int order, String string, BigDecimal bigDecimal) {
				myBigDecimal = bigDecimal;
				myOrder = order;
				myString = string;
			}

			String getString() {
				return myString;
			}

			int getOrder() {
				return myOrder;
			}

			BigDecimal getBigDecimal() {
				return myBigDecimal;
			}

			@Override
			public String toString() {
				return "BigDecimal: " + myBigDecimal + ", String: " + myString + ", Order: " + myOrder;
			}
		}

		SpecialBigDecimal[] list = new SpecialBigDecimal[n];
		for (int i = 0; i < n; i++) {
			list[i] = new SpecialBigDecimal(i, s[i], new BigDecimal(s[i]));
		}
		Arrays.sort(list, Comparator.comparing(SpecialBigDecimal::getBigDecimal).reversed()
				.thenComparing(SpecialBigDecimal::getOrder));

		for (int i = 0; i < n; i++) {
			s[i] = list[i].getString();
		}

		///////////// locked /////////////
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
