import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem
 * Practice > Java > Strings > Tag Content Extractor
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class MedJavaTagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String regex = "<(.+)>([^<>]+)</\\1>";
		Pattern pat = Pattern.compile(regex);
		while (testCases > 0) {
			String line = in.nextLine();
			Matcher mat = pat.matcher(line);

			// Write your code here
			if (mat.find()) {
				mat.reset();
				while (mat.find()) {
					System.out.println(mat.group(2));
				}
			} else {
				System.out.println("None");
			}

			testCases--;
		}
	}
}
