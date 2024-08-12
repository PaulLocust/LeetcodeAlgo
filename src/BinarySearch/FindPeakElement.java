package BinarySearch;

/*
 * 162. Find Peak Element
 * Пара уточнений для себя, если в задаче указано вычислить что-то за log(n), то это практически гарантия того, что нужен бинарный поиск
 * или его вариация.
 * Данная задача сбила меня с толку, когда я впервые её увидел, ведь массив нельзя отсортировать, но с её условием стало понятно, что это возможно.
 * Нужно всегда смотреть на того соседа, который больше, то есть применить немного greedy, ведь шанс, того что мы найдём там ответ выше.
 * Ко всему прочему мы проверяем края массива, ведь всё, что за пределами определённых значений массива - это (-inf), число заведомо меньшее,
 * чем всё, что нам могло попасться в массиве.
 */
public class FindPeakElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 4 };
		int n = nums.length;
		if (n == 1 || nums[0] > nums[1]) {
			return 0;
		}
		if (nums[n - 1] > nums[n - 2]) {
			return n - 1;
		}
		int low = 1;
		int high = n - 2;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
				return mid;
			} else if (nums[mid] < nums[mid + 1]) {
				low = mid + 1;
			} else if (nums[mid] < nums[mid - 1]) {
				high = mid - 1;
			}
		}
		return -1;
	}

}
