package TwoPointers;

/**
 * return false;
 */
public class TwoSumTwo {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = new int[2];

		int leftFlag = 0;
		int rightFlag = numbers.length - 1;

		while (leftFlag < rightFlag) {
			int twoSum = numbers[leftFlag] + numbers[rightFlag];
			if (twoSum > target) {
				rightFlag--;
			} else if (twoSum < target) {
				leftFlag++;
			} else {
				ans[0] = leftFlag + 1;
				ans[1] = rightFlag + 1;
				break;
			}
		}

		for (int n : ans) {
			System.out.println(n);
		}
	}

}
