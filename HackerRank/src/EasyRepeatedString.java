import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/repeated-string/problem
 * Practice > Algorithms > Implementation > Repeated String
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyRepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		// find how many times a occurs in s
		// then find out how many times s will fit entirely in n characters and multiply
		// to find the number of a's
		// if s doesn't fit perfectly into n characters, find the remainder and get one
		// last substring and count those a's as well
		long sLength = s.length();
		String sub = s.substring(0, (int) (n % sLength));
		long alast = sub.length() - sub.replace("a", "").length();
		return ((s.length() - s.replace("a", "").length()) * (n / sLength)) + alast;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
