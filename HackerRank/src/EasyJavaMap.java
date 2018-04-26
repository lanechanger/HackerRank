import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
 * https://www.hackerrank.com/challenges/phone-book/problem
 * Practice > Java > Data Structures > Java Map
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

public class EasyJavaMap {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Map<String, Integer> result = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = in.readLine();
			Integer phone = Integer.valueOf(in.readLine());
			result.put(name, phone);
		}

		String s;
		while ((s = in.readLine()) != null) {
			Integer num = result.get(s);
			if (num != null) {
				System.out.println(s + "=" + num);
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
