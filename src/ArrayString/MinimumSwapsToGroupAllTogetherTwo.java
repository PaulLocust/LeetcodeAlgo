package ArrayString;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToGroupAllTogetherTwo {

	public static void main(String[] args) {
		int[] nums = {0,1,1,0,1,0,0};
		int[] circle = new int[nums.length*2];
		System.arraycopy(nums, 0, circle, 0, nums.length);
		System.arraycopy(nums, 0, circle, nums.length, nums.length-1);
		
		Arrays.sort(nums);
		int countOne = 0;
		for (int i = nums.length-1; i > 0; i--) {
			if (nums[i] == 1) {
				countOne += 1;
			} else {
				break;
			}
		}
		
		int window = 0;
		for (int i = 0; i < countOne; i++) {
			window += circle[i];
		}
		System.out.println(window);
		int minSwap = Integer.MAX_VALUE;
		for (int i = countOne; i < circle.length; i++) {
			window += circle[i] - circle[i-countOne];
			System.out.println(window);
			if (window == countOne) {
				minSwap = 0;
				break;
			} else {
				minSwap = Math.min(minSwap, countOne - window);
			}
			
		}
		
		System.out.println(minSwap);
		
		
		
	}

}
