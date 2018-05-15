import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/camelcase/problem
 * Practice > Algorithms > Strings > CamelCase
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyCamelCase {

	// Complete the camelcase function below.
	static int camelcase(String s) {
		return s.split("[A-Z]").length;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = camelcase(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
