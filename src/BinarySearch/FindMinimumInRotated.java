package BinarySearch;

/*
 * 153. Find Minimum in Rotated Sorted Array
 */
public class FindMinimumInRotated {

	public static void main(String[] args) {
		int[] nums = {5,1,2,3,4};
		//int[] nums = { 3, 4, 5, 6, 2 };
		
		int low = 0;
		int high = nums.length-1;
		int ansNum = Integer.MAX_VALUE;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[low] <= nums[mid]) {
				ansNum = Math.min(nums[low], ansNum);
				low = mid + 1;
			} else {
				ansNum = Math.min(nums[mid], ansNum);
				high = mid - 1;
			}
		}
		System.out.println(ansNum);
		
	}

}
