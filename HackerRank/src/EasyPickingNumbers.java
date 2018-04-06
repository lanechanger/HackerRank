import java.util.Arrays;
import java.util.Scanner;
/*https://www.hackerrank.com/challenges/picking-numbers/problem
Practice > Algorithms > Implementation > Picking Numbers
by Jeremy Ng (lanechanger)*/

public class EasyPickingNumbers {
    static int pickingNumbers(int[] a) {
        // Complete this function
		// See the two accompanying analyses .jpeg files for thought process
		// v1: was initially thinking of a one flag system
		// v2: settled on a 2 flag system (technically a 3rd with sum2's -1
    	Arrays.sort(a);
    	int max = 0;
    	int last = a[0];
    	int sum1 = 1;
		int sum2 = -1;
		boolean flag1 = true;
		boolean flag2 = false;
    	int delta;

    	for(int i = 1; i < a.length; i++) {
			delta = a[i] - last;
			last = a[i];

			if (delta > 1) {
				flag1 = true;
				flag2 = false;
				sum1 = 1;
				sum2 = -1;
    		}else {
				if (delta == 0) {
					sum1++;
					if (sum2 > 0) {
						sum2++;
					}
				} else { // delta == 1
					if (flag1) {
						flag1 = !flag1;
						sum1++;
					} else {
						flag1 = !flag1;
						sum1 = 1;
					}

					if (flag2) {
						flag2 = !flag2;
						sum2++;
    				}else {
						flag2 = !flag2;
						sum2 = 1;
    				}
    			}

				if (Integer.max(sum1, sum2) > max) {
					max = Integer.max(sum1, sum2);
				}
    		}
    	}
		return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
