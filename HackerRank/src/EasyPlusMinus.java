import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/plus-minus/problem
Practice > Algorithms > Warmup > Plus Minus
by Jeremy Ng (lanechanger)*/

public class EasyPlusMinus {

    static void plusMinus(int[] arr) {
        // Complete this function
    	NumberFormat formatter = new DecimalFormat("#0.000000");
    	int pos = 0;
    	int neg = 0;
    	int zeroes = 0;
    	for(int curr : arr) {
    		if(curr > 0) {
    			pos++;
    		}else if(curr < 0) {
    			neg++;
    		}else {
    			zeroes++;
    		}
    	}
		System.out.println(formatter.format((double) pos / arr.length));
		System.out.println(formatter.format((double) neg / arr.length));
		System.out.println(formatter.format((double) zeroes / arr.length));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}