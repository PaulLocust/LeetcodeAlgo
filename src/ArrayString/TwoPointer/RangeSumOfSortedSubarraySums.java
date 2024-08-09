package ArrayString.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class RangeSumOfSortedSubarraySums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 2, 3, 4};
		int n = nums.length;
		ArrayList<Integer> subresults = new ArrayList<>();
		
		LinkedList<Integer> windowsList = new LinkedList<Integer>();
		int window = nums[0] + nums[1];
		int windowLength = 2;
		windowsList.add(window);
		
		
		while (windowLength < n) {
			for (int i = 0; i < n; i++) {
				if (nums.length - i < windowLength) {
					break;
				} else {
					
				}
			}
		}
		
	}

}
