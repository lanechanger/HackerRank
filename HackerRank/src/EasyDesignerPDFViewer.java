import java.util.Scanner;
/*https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
Practice > Algorithms > Implementation > Designer PDF Viewer
by Jeremy Ng (lanechanger)*/

public class EasyDesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
    	int width = word.length();
		int height = Integer.MIN_VALUE;

    	for(int i = 0; i < word.length(); i++) {
			int current = "abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(word.charAt(i)));
			if (h[current] > height) {
				height = h[current];
			}
    	}
		return height * width;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
