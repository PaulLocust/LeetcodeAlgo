package ArrayString.TwoPointer;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		Arrays.sort(nums);
		
		int val = 2;
		int firstPointer = 0;
		int secondPointer = nums.length - 1;
        int removedCount = 0;
        while (firstPointer < secondPointer) {
            if (nums[firstPointer] == val) {
            	nums[firstPointer] = 101;
                removedCount++;
                firstPointer++;
            }
            else if (nums[secondPointer] == val) {
            	nums[secondPointer] = 101;
                removedCount++;
                secondPointer--;
            }
            else {
            	firstPointer++;
            	secondPointer--;
            }
        }
        Arrays.sort(nums);
        for (int num: nums) {
        	System.out.println(num);
        }
        System.out.println(removedCount);
	}

}
