package ArrayString;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 12. Integer to Roman 
 * В этом решении я использовал SortedMap, потому что он
 * даёт возможность идти по порядку, здесь я решил проверять, будет ли наше
 * число больше, чем самый большой ключ(roman.lastKey() в моём случае). Если да,
 * то мы прибавляем к результирующей строке значение этого ключа а также
 * отнимаем сам ключ от числа. Когда мы понимаем, что число стало меньше нашего
 * самого большого ключа, мы удаляем этот ключ и движемся дальше, пока число не
 * станет равно 0 и мы не получим готовый результат.
 */
public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 3749;
		SortedMap<Integer, String> roman = new TreeMap<>();
		roman.put(   1, "I" );
		roman.put(   4, "IV");
		roman.put(   5, "V" );
		roman.put(   9, "IX");
		roman.put(  10, "X" );
		roman.put(  40, "XL");
		roman.put(  50, "L" );
		roman.put(  90, "XC");
		roman.put( 100, "C" );
		roman.put( 400, "CD");
		roman.put( 500, "D" );
		roman.put( 900, "CM");
		roman.put(1000, "M" );
		StringBuilder result = new StringBuilder();
		
		while (num > 0) {
			if (num >= roman.lastKey()) {
				result.append(roman.lastEntry().getValue());
				num -= roman.lastKey();
			} else {
				roman.remove(roman.lastKey());
			}
		}
		System.out.println(result.toString());
	}
	
}
