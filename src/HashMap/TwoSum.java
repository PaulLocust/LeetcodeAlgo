package HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * 1. Two Sum
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6;
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
        	int partOfSum = target - nums[i];
        	if (map.containsKey(partOfSum) && map.get(partOfSum) != i) {
        		return new int[] {i, map.get(partOfSum)};
        	}
        }
        
        return new int[] {};

	}

}
