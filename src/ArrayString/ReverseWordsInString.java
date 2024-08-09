package ArrayString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 151. Reverse Words in a String
 */
public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "a good   example";
		String[] strs = s.split(" ");
		List<String> list = Arrays.asList(strs);
		Collections.reverse(list);
		StringBuilder ans = new StringBuilder();
		for (String str: list) {
			if (!str.isEmpty()) {
				ans.append(" " + str);
			}
		}
		System.out.println(ans.toString().trim());
	}

}
