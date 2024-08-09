package ArrayString.TwoPointer;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplicateSortTwo {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3};
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
            	map.put(num, map.get(num)+1);
            } else {
            	map.put(num, 1);
            }
            
        }
        for (Entry<Integer, Integer> entry: map.entrySet()) {
        	if (entry.getValue() > 2)
        }
        System.out.println(map.toString());
		
		/**
		int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
		*/
	}

}
