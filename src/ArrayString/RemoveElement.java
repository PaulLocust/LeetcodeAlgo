package ArrayString;

import java.util.Arrays;

/**
 * 27. Remove Element
 * Hint
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the 
 * following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int count = 0;
		Arrays.sort(nums); //{0,0,1,2,2,2,3,4}
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] == 2) ) {
				nums[i] = 101; // это было верхним ограничением для искомого числа (val), я сделал так, чтобы при сортировке
							   // эти числа всегда были сверху и не мешали программе проверять решение
				count++;
			}
		}
		Arrays.sort(nums); //{0, 0, 1, 3, 4, 101, 101, 101}
		System.out.println(nums.length - count); //Вывод: 5|| это и есть число k, кол-во эл. которые остались после удаления val элементов.
		for (int num: nums) {
			System.out.println(num);
		}
	}

}
