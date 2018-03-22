import java.util.Scanner;
/*https://www.hackerrank.com/challenges/grading/problem
Practice > Algorithms > Implementation > Grading Students
by Jeremy Ng (lanechanger)*/

public class EasyGradingStudents {

	static int[] solve(int[] grades){
        // Complete this function
    	int[] results = new int[grades.length];
    	for(int i = 0; i < grades.length; i++) {
    		if(grades[i] < 38) {
    			results[i] = grades[i];
    		}else {
    			char last = Integer.toString(grades[i]).charAt(1);
    			if("89".indexOf(last) >= 0){
					results[i] = (int) (Math.round(grades[i] / 10.0) * 10);
				} else if ("345".indexOf(last) >= 0) {
					results[i] = Integer.parseInt(Integer.toString(grades[i]).substring(0, 1) + "5");
				} else if ("01267".indexOf(last) >= 0) {
    				results[i] = grades[i];
    			}
    		}
    	}
    	return results;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}
}