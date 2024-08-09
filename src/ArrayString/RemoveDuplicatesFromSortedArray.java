package ArrayString;
/**
 * 26. Remove Duplicates from Sorted Array
 * Hint
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each 
 * unique element appears only once. The relative order of the elements should be kept the same. 
 * Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements 
 * in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int index = 0;
		int memory = -9999;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != memory) {
				nums[index] = nums[i];
				memory = nums[i];
				index++;
			} else {
				continue;
			}
		}
		System.out.println("k = " + index);
		for (int num: nums) {
			System.out.println(num);
		}
		
		
	}
	
}
