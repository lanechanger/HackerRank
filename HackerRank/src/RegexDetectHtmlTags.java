import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * https://www.hackerrank.com/challenges/detect-html-tags/problem
 * Practice > Regex > Applications > Detect HTML Tags
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class RegexDetectHtmlTags {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String regex = "<(?!/)(.*?)(\\s|>)";
		Pattern pat = Pattern.compile(regex);
		TreeSet<String> list = new TreeSet<>();
		while (0 <= --n) {
			String s = in.nextLine();
			Matcher mat = pat.matcher(s);
			while (mat.find()) {
				list.add(mat.group(1));
			}
		}

		while (!list.isEmpty()) {
			System.out.print(list.pollFirst());
			System.out.print((!list.isEmpty()) ? ";" : "");
		}
	}
}
