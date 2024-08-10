package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MinimumNumberPushesToTypeWordTwo {

	public static void main(String[] args) {

		String word = "alporfmdqsbhncwyu";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] charArr = word.toCharArray();
		/*
		 * Creating map with char-keys and their count in string as values {a=2, b=2,
		 * c=2, d=2, e=2, f=2, g=2, h=2, i=6}
		 */
		for (Character ch : charArr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

		/*
		 * Creating linked list of map-keys sorted in decreasing order of values [i, a,
		 * b, c, d, e, f, g, h]
		 */
		LinkedList<Character> linked = new LinkedList<>();
		map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
				.forEach(entry -> linked.add(entry.getKey()));

		System.out.println(linked.toString());

		/*
		 * Creating map representing letters and number of pushes to enter them with
		 * buttons
		 */
		HashMap<Character, Integer> charPushCountMap = new HashMap<>();
		int buttonCount = 1;
		int pushCount = 1;
		for (Character ch : linked) {
			if (buttonCount < 9) {
				//System.out.println("buttonCount1): " + buttonCount);
				charPushCountMap.put(ch, pushCount);
				buttonCount++;
			} else {
				buttonCount = 2;
				pushCount += 1;
				//System.out.println("buttonCount22: " + buttonCount);
				charPushCountMap.put(ch, pushCount);
			}
		}
		System.out.println(charPushCountMap.toString());
		/*
		 * Calculating number of pushes to enter full string
		 */
		int count = 0;
		for (Character ch : charArr) {
			if (charPushCountMap.containsKey(ch)) {
				count += charPushCountMap.get(ch);
			}
		}
		System.out.println(count);
		

	}

}
