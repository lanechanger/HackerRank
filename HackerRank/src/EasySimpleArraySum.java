import java.util.Scanner;
/*https://www.hackerrank.com/challenges/simple-array-sum/problem
Practice > Algorithms > Warmup > Simple Array Sum
by Jeremy Ng (lanechanger)*/

public class EasySimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
		/*
		 * integer simpleArraySum(integer n, integer_array ar) { # Return the sum of all
		 * array elements } n: Integer denoting number of array elements ar: Integer
		 * array with elements whose sum needs to be computed
		 */
    	int max = 0;
		for (int i : ar) {
			max += i;
		}
    	return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}

