import java.util.Scanner;
/*https://www.hackerrank.com/challenges/strange-advertising/problem
Practice > Algorithms > Implementation > Viral Advertising
by Jeremy Ng (lanechanger)*/

public class EasyViralAdvertising {
    static int viralAdvertising(int n) {
        // Complete this function
		int result = 2;
		int advertised = 5;
		int liked = 2;

		for (int i = 1; i < n; i++) {
			advertised = liked * 3;
			liked = advertised / 2;
			result += liked;
		}

		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
