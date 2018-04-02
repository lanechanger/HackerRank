import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*https://www.hackerrank.com/challenges/utopian-tree/problem
Practice > Algorithms > Implementation > Utopian Tree
by Jeremy Ng (lanechanger)*/

public class EasyUtopianTree {
    static int utopianTree(int n) {
        // Complete this function
    	int height = 1;
    	for(int i = 1; i <= n; i++) {
    		height = (i % 2 == 1) ? height * 2 : height + 1;
    	}
    	return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
