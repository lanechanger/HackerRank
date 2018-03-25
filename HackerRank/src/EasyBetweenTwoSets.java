import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/between-two-sets/problem
Practice > Algorithms > Implementation > Between Two Sets
by Jeremy Ng (lanechanger)*/

public class EasyBetweenTwoSets {

	/*
	 * Complete the getTotalX function below.
	 */
	static int getTotalX(int[] a, int[] b) {
		/*
		 * Write your code here.
		 */
		// integer getTotalX(integer_array a, integer_array b) {
		// # Return the number of integers between the two sets
		// }
		// a: array of elements in set A
		// b: array of elements in set B

		// arrays aren't guaranteed to be sorted, first sort it for easier processing
		// downstream. a*log(a) + b*log(b) time
		Arrays.sort(a);
		Arrays.sort(b);

		// if the largest number in a is larger than the smallest number of b, then this
		// is impossible, return 0
		if (a[a.length - 1] > b[0]) {
			return 0;
		}

		// determine the factors for elements of B starting with its smallest element
		List<Integer> d = new ArrayList<>();
		largeOuter: for(int i = b[0]; i > 0; i--) {
			for (int j = 0; j < b.length; j++) {
				if(b[j] % i == 0) {
					continue;
				}else {
					continue largeOuter;
				}
			}
			// the only way the code gets here is if the current number is a factor of all
			// elements of B, add this to the list
			d.add(i);
		}

		// for each element in the list we just made, traverse through A to see if all
		// elements of A are a factor of it, if not, discard the number
		for (int i = 0; i < d.size(); i++) {
			for (int j = 0; j < a.length; j++) {
				if (d.get(i) % a[j] == 0) {
					continue;
				} else {
					d.remove(i);
					i--;

					// exit early if we run out of numbers
					if (d.size() == 0) {
						return 0;
					}
				}
			}
		}

		// the rest of the numbers in d are factors of all elements of B and all
		// elements of A are factors of its numbers
		return d.size();
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[] a = new int[n];
		for (int aItr = 0; aItr < n; aItr++) {
			a[aItr] = in.nextInt();
		}

		int[] b = new int[m];
		for (int bItr = 0; bItr < m; bItr++) {
			b[bItr] = in.nextInt();
		}

		System.out.println(getTotalX(a, b));
	}
}
