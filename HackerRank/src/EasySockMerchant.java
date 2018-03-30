import java.util.Scanner;
/*https://www.hackerrank.com/challenges/sock-merchant/problem
Practice > Algorithms > Implementation > Sock Merchant
by Jeremy Ng (lanechanger)*/

public class EasySockMerchant {
	static int sockMerchant(int n, int[] ar) {
		// Complete this function
		int result = 0;
		int SOCK_COLORS = 100;
		boolean[] socks = new boolean[SOCK_COLORS];

		for (int i = 0; i < n; i++) {
			int currentSock = ar[i] - 1;
			if (socks[currentSock]) {
				socks[currentSock] = false;
				result++;
			} else {
				socks[currentSock] = true;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}