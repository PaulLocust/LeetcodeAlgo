package BinarySearch;

public class BinSearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Базовая реализация бинарного поиска
	 * @param sortedArray
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}
}
