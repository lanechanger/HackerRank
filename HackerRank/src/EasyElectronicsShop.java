import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/electronics-shop/problem
Practice > Algorithms > Implementation > Electronics Shop
by Jeremy Ng (lanechanger)*/

public class EasyElectronicsShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int s) {
		// Complete this function
		// definitely more elegant and succinct ways to do this but I'm going through a
		// streams practicing phase
		int minKeyboard = Arrays.stream(keyboards).min().getAsInt();
		int minDrives = Arrays.stream(drives).min().getAsInt();
		int maxKeyboard = Arrays.stream(keyboards).max().getAsInt();
		int maxDrives = Arrays.stream(drives).max().getAsInt();

		// base case, can't afford
		if ((minKeyboard + minDrives) > s) {
			return -1;
		} else if ((maxKeyboard + maxDrives) < s) {
			// base case, have way too much money
			return maxKeyboard + maxDrives;
		} else {
			// got to do some leg work here to figure out what's optimal
			// we don't need the same values, or any value that is larger than s
			int[] modifiedKeyboards = Arrays.stream(keyboards).distinct().filter(E -> E < s).toArray();
			int[] modifiedDrives = Arrays.stream(drives).distinct().filter(E -> E < s).toArray();
			List<Integer> sums = new ArrayList();
			for (int i = 0; i < modifiedKeyboards.length; i++) {
				for (int j = 0; j < modifiedDrives.length; j++) {
					int current = modifiedKeyboards[i] + modifiedDrives[j];
					// break out early if we find a combination that matches s
					if (current == s) {
						return current;
					} else if (current < s) {
						sums.add(current);
					}
					// don't bother adding to the list if the combination exceeds s
				}
			}
			return sums.stream().max((x, y) -> x - y).get().intValue();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] drives = new int[m];
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		// The maximum amount of money she can spend on a keyboard and USB drive, or -1
		// if she can't purchase both items
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
	}
}
