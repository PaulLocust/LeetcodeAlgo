package ArrayString;
/**
 * 189. Rotate Array
 * Medium
 * Given an integer array nums, rotate the array to the right by k steps, 
 * where k is non-negative.
 */
public class RotateArray {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int k = 2;
	}
	
	public void rotate(int[] nums, int k) {
        k %= nums.length; // это нужно для случаев, когда k > length, и когда
        				  // k будет равно 0, ни одна перестановка не будет сделана,
        				  // в других случаях - всего одна перестановка.
        reverse(nums, 0, nums.length-1); // 1. {4, 3, 2, 1} - Сначала реверсируем весь массив
        reverse(nums, 0, k-1);			 // 2. {3, 4, 2, 1} - Здесь реверсируем только k первых элементов
        reverse(nums, k, nums.length-1); // 3. {3, 4, 1, 2} - И наконец реверсируем все элементы после k-го индекса
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
        	// {1, 2, 3, 4} = {}
            int temp = nums[start]; // {1}
            nums[start] = nums[end]; // {4,2,3,4}
            nums[end] = temp; // {4,2,3,1}
            start++;
            end--;
        }
    }
    
    

}
/**
 * Это решение работает, но убивается на длинных списках, решение неэффективно 
 * с точки зрения расходуемого времени.
 */
/**
	int[] nums = {1,2}; // 2,1/ 1,2/ 2,1
	int k = 3;
	k %= nums.length;
	int left = 0;
	int maxIndex = nums.length - 1;
	int right = maxIndex;
	
	while (right >= k) {
		int buffer = 0;
		
		for (int i = k-1; i >= 0; i--) {
			buffer = nums[maxIndex-i];
			nums[maxIndex-i] = nums[maxIndex-i-1];
			nums[maxIndex-i-1] = buffer;
		}
		maxIndex--;
		right--;
	}
	for (int num: nums) {
		System.out.print(num + ", ");
	}
*/