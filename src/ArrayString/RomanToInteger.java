package ArrayString;

import java.util.HashMap;

/**
 * 13. Roman to Integer Если текущее число больше следующего, то мы просто
 * добавляем его в нашу сумму, иначе отнимаем от следующего текущее, также не
 * забываем про тот момент, когда цикл доходит до конца и ему просто не с чем
 * сравнивать последнее число, здесь я всё обработал. И ещё нужно помнить про
 * краевой случай где длина строки равна 1.
 */
public class RomanToInteger {

	public static void main(String[] args) {
		String str = "XCVIII";
		char[] ch = str.toCharArray();

		HashMap<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		int ans = 0;
		if (ch.length == 1) {
			System.out.println(roman.get(ch[0]));
		}
		for (int i = 0; i < ch.length - 1; i++) {
			if (roman.get(ch[i]) >= roman.get(ch[i + 1])) {
				ans += roman.get(ch[i]);
				if (i + 1 == ch.length - 1) {
					ans += roman.get(ch[i + 1]);
				}
			} else {
				ans += roman.get(ch[i + 1]) - roman.get(ch[i]);
				i += 1;
				if (i + 1 == ch.length - 1) {
					ans += roman.get(ch[i + 1]);
				}
			}
		}
		System.out.println(ans);
	}

}
