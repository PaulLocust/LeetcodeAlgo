package BinarySearch;
/*
 * 33. Search in Rotated Sorted Array
 * Смысл задачи в том, чтобы искать отсортированную часть массива, и пытаться в ней найти target, если
 * target не удовлетворяет условиям, то есть его нет в отсортированной половине, то мы начинаем поиск в другой половине.
 * 
 * Сначала, мы смотрим в какой стороне от середины находится отсортированная в возрастающей послед. часть массива:
 * 
 * if nums[mid] >= nums[low], то массив отсортирован вот так  ~ {3, 4, 5, 6, 7, 1, 2} 
 * идёт такая проверка: if nums[low] <= target < nums[mid], то мы переходим на левую 100% отсортированную половину, иначе на правую
 * 
 * if nums[mid] <= nums[high], то массив отсортирован вот так ~ {1, 2, 3, 4, 5, 6, 7} 
 * идёт такая проверка: if nums[mid] < target >= nums[high], то мы переходим на правую 100% отсортированную половину, иначе на левую
 */
public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 3, 1 };
		int target = 1;
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = -1;

		while (low <= high) {
			int mid = low + ((high - low) / 2);

			if (nums[mid] == target) {
				ans = mid;
				break;
			} else if (nums[mid] >= nums[low]) { // это нужно в том случае, если mid {3, 1} равен low как в этом случае 3 = 3
				if (nums[low] <= target && nums[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (nums[high] >= target && nums[mid] < target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		System.out.println(ans);
	}

}
