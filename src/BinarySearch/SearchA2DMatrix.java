package BinarySearch;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean ans = false;
		for (int[] subArr : matrix) {
			int low = 0;
			int high = subArr.length - 1;
			while (low <= high) {
				int mid = low + ((high - low) / 2);
				if (subArr[mid] > target) {
					high = mid - 1;
				} else if (subArr[mid] < target) {
					low = mid + 1;
				} else if (subArr[mid] == target) {
					ans = true;
					break;
				}
			}
		}
		System.out.println(ans);

	}

}
