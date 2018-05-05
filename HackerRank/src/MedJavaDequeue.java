import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-dequeue/problem
 * Practice > Java > Data Structures > Java Dequeue
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 * For some reason I was coding this to return the max count of a given element in the subarray
 * rather than the number of distinct elements.  Otherwise a Set would have been better utilized.
 */

public class MedJavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 1;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (max < m) {
				// only read in the rest of the numbers but skip all the work if we already
				// found a max == m because there won't be a higher max that's > m
				if (i >= m - 1) {
					// number of elements have grown to or past the subarray size, need to start
					// comparing
					deque.addLast(num);
					if (i == m - 1) {
						// for the first time reaching the subarray size, check all previous m elements
						// and add to map
						for (Iterator<Integer> it = deque.descendingIterator(); it.hasNext();) {
							int prev = it.next();
							if (map.containsKey(prev)) {
								// already have entry, increment
								int prevValue = map.get(prev);
								map.replace(prev, prevValue, prevValue + 1);

							} else {
								// new entry
								map.put(prev, 1);
							}
						}
					} else {
						// once we're past the subarray size in iteration, we just need to check the
						// newly added value
						if (map.containsKey(num)) {
							// already have entry, increment
							int numValue = map.get(num);
							map.replace(num, numValue, numValue + 1);
						} else {
							// new entry
							map.put(num, 1);
						}
					}

					if (map.size() > max) {
						// after the modifications to the map, if there are more distinct elements than
						// our current max then set new max
						max = map.size();
					}

					// remove the first element from both the deque and the map as it's no longer
					// needed
					int head = deque.removeFirst();
					int headValue = map.get(head);
					if (headValue > 1) {
						map.replace(head, headValue, headValue - 1);
					} else {
						// if there were only 1 key, remove this element from the map altogether
						map.remove(head);
					}

				} else {
					// number of elements hasn't grown past the subarray size yet, simply add to
					// deque
					deque.addLast(num);
				}
			}
		}

		System.out.println(max);
	}
}
