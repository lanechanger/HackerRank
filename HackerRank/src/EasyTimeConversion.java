import java.util.Scanner;
/*https://www.hackerrank.com/challenges/time-conversion/problem
Practice > Algorithms > Warmup > Time Conversion
by Jeremy Ng (lanechanger)*/

public class EasyTimeConversion {

	static String timeConversion(String s) {
		// Complete this function
		// string timeConversion(string s) {
		// # Return the 24-hour format time.
		// }
		//
		// s: String which contains time.
		int hour = Integer.parseInt(s.substring(0, 2));
		if (s.contains("AM")) {
			return (hour == 12) ? "00" + s.substring(2, s.length() - 2) : s.substring(0, s.length() - 2);
		} else {
			if (hour == 12) {
				return s.substring(0, s.length() - 2);
			} else {
				hour += 12;
				return (hour == 24) ? "00" + s.substring(2, s.length() - 2)
						: Integer.toString(hour) + s.substring(2, s.length() - 2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}