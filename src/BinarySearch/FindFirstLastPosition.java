package BinarySearch;

import java.util.LinkedHashMap;

/*
 * 34. Find First and Last Position of Element in Sorted Array
 * Задача интересная тем, что здесь используются 2 бинарных поиска в виде метода binSearch.
 * Мы ищем последнее вхождение слева - 1)binSearch и справа - 2)binSearch.
 * Полученные индексы, в зависимости от настроек поиска, будут первым и последним вхождением числа в массив nums
 */
public class FindFirstLastPosition {

	public static void main(String[] args) {
		int[] nums = { 5, 8, 8, 9, 9, 9, 10 };
		int target = 9;
		int[] ans = { -1, -1 };
		int left = binSearch(nums, target, true);
		int right = binSearch(nums, target, false);
		ans[0] = left;
		ans[1] = right;
		System.out.println(left + " " + right);
	}
		
	
	public static int binSearch(int[] nums, int target, boolean isSearchingLeft) {
		int idx = -1;
		int low = 0;
		int high = nums.length-1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				idx = mid;
				if (isSearchingLeft) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			
		}
		
		return idx;
	}
	
}

