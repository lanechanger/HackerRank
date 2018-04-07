import java.util.Scanner;
/*https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
Practice > Algorithms > Implementation > Beautiful Days at the Movies
by Jeremy Ng (lanechanger)*/

public class EasyBeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
    	int results = 0;

		for (int x = i; x <= j; x++) {
    		if(Math.abs(x - Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString())) % k == 0) {
    			results++;
    		}
    	}

    	return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
