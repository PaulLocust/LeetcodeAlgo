package BinarySearch;

/*
 * 35. Search Insert Position
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		int [] nums = {1, 3, 5,6, 7, 9};
		int target = 4;
		int low = 0;
		int high = nums.length-1;
		int ans = 0; 
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (nums[mid] < target) {
				low = mid + 1;
				ans = low;
			} else if (nums[mid] > target) {
				high = mid - 1;
				ans = high+1;
			} else if (nums[mid] == target) {
				ans = mid;
				break;
			}
		}
		System.out.println(ans);
	}

}
