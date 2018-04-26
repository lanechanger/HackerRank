import java.time.LocalDate;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 * Practice > Java > Introduction > Java Date And Time
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 * Resource: https://docs.oracle.com/javase/tutorial/datetime/iso/enum.html
 */

public class EasyJavaDateAndTime {
	public static String getDay(String day, String month, String year) {
		/*
		 * Write your code here.
		 */
		// DayOfWeek dotw = LocalDate.of(Integer.parseInt(year),
		// Integer.parseInt(month), Integer.parseInt(day))
		// .getDayOfWeek();
		//
		// String result = dotw.getDisplayName(TextStyle.FULL,
		// Locale.getDefault()).toUpperCase();

		LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		String result = dt.getDayOfWeek().toString();

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}