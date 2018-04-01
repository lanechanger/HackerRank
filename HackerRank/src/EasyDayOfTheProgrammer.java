import java.util.Scanner;
/*https://www.hackerrank.com/challenges/day-of-the-programmer/problem
Practice > Algorithms > Implementation > Day Of The Programmer
by Jeremy Ng (lanechanger)*/

public class EasyDayOfTheProgrammer {
	static String solve(int year) {
		// Complete this function
		String partialSolution = "09." + year;
		if (year == 1918) {
			return "26." + partialSolution;
		} else if (year < 1918) {
			// julian calendar
			if (year % 4 == 0) {
				// leap year
				return "12." + partialSolution;
			} else {
				return "13." + partialSolution;
			}
		} else {
			// Gregorian calendar
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				// leap year
				return "12." + partialSolution;
			} else {
				return "13." + partialSolution;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
