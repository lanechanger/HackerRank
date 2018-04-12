import java.util.Scanner;
/*https://www.hackerrank.com/challenges/find-digits/problem
Practice > Algorithms > Implementation > Find Digits
by Jeremy Ng (lanechanger)*/

public class EasyFindDigits {
    static int findDigits(int n) {
        // Complete this function
		String nString = Integer.toString(n);
		int results = 0;
		for(int i = 0; i < nString.length(); i++) {
			int currentNum = Integer.valueOf(nString.substring(i, i + 1));
			if ((currentNum != 0) && (n % currentNum) == 0) {
				results++;
			}
		}
		return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
