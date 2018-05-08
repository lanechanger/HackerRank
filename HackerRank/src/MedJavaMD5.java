import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-md5/problem
 * Practice > Java > Advanced > Java MD5
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

import javax.xml.bind.DatatypeConverter;

public class MedJavaMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		MessageDigest md = MessageDigest.getInstance("MD5");
		String s = input.next();
		System.out.println(DatatypeConverter.printHexBinary(md.digest(s.getBytes())).toLowerCase());
	}

}
