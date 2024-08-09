package ArrayString;

import java.util.Arrays;
/* 
 * 274. H-Index
 * Индекс Хирша можно легко вычислить, отсортировав массив чисел в порядке невозрастания, после чего, нужно
 * найти самое последнее число, значение которого будет больше его порядкового номера в массиве начиная с единицы. 
 * Порядковый номер этого числа и будет индексом Хирша
 * Пример:
 * Порядковый номер статьи {1,  2,  3,  4,  |5|, 6, 7, 8, 9, 10, 11}
 * Число цитирований       {49, 23, 15, 14, |6|, 3, 1, 1, 0, 0,  0 }
 * H-Index = 5.
 */
public class HirshIndex {

	public static void main(String[] args) {
		int[] citations = {100}; //{0,1,3,5,6}
		Arrays.sort(citations);
		int[] citSortRev = new int[citations.length];
		
		for (int i = citations.length-1, k = 0 ; i >= 0; i--, k++) {
			citSortRev[k] = citations[i]; // {6,5,3,1,0}
		}
		
		int hIndex = 0;
		for (int i = 0; i < citSortRev.length; i++) {
			if (citSortRev[i] >= i+1) {
				hIndex = i+1;
			}
		}
		System.out.println(hIndex);
	}

}
