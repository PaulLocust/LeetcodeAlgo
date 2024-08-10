package TwoPointers;

/**
 * 11. Container With Most Water
 * В этой задаче главное всегда двигаться от более низкой линии к следующей и попутно
 * высчитывать объём воды.
 */
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int linesCount = height.length;

		int left = 0;
		int right = linesCount - 1;

		int maxVol = 0;
		while (left < right) {
			int waterSegmentsCount = right - left;
			int lowerLineHeight = Math.min(height[left], height[right]);
			int waterVol = lowerLineHeight * waterSegmentsCount;
			maxVol = Math.max(maxVol, waterVol);
			System.out.println(maxVol);
			if (height[left] < height[right]) {
				left++;
			} else if (height[left] > height[right]) {
				right--;
			} else {
				left++;
				right--;
			}
		}
		System.out.println(maxVol);

	}

}
