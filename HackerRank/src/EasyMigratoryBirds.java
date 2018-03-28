import java.util.Scanner;
/*https://www.hackerrank.com/challenges/bon-appetit/problem
Practice > Algorithms > Implementation > Bon Appétit
by Jeremy Ng (lanechanger)*/


public class EasyMigratoryBirds {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int totalItems = in.nextInt();
		int allergicIndex = in.nextInt();
		int sum = 0;
		for (int i = 0; i < totalItems; i++) {
			int current = in.nextInt();
			// add the number if it wasn't what Anna was allergic to
			sum += (i != allergicIndex) ? current : 0;
        }
		int charged = in.nextInt();
		int actual = sum / 2;
		// delta(charged, actual) if brian overcharged, "Bon Appetit" otherwise
		System.out.println((actual == charged) ? "Bon Appetit" : charged - actual);
    }
}
