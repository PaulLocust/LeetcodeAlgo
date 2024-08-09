package ArrayString;
/**
 * 55. Jump Game
 * Medium
 * You are given an integer array nums. You are initially positioned at the array's first index, 
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {
	// Мысль: Искать в радиусе текущего прыжка наилучший из доступных прыжков. 
	// Пример:
	// {2,4,1} - мы находимся в 2, поэтому нам доступны прыжки 4 и 1, выбираем 4.
	/*
	 * Мысль2-лучше: идти от обратного и выцеливать те точки из которых можно попасть к финишу сразу, если
	 * их нет, то сразу false, иначе нужно узнать, можно ли попасть в эти точки и т.д. до самого старта
	 */
	public static void main(String[] args) {
		int[] nums = {3,4,2,0,0,4};  //{3,4,2,0,0,4}
		
		long startTime = System.currentTimeMillis();
		System.out.println(canJumpMine(nums)); // 
		System.out.println(canJumpSecond(nums));
		long finishTime = System.currentTimeMillis();
		double solutionTime = finishTime - startTime;
		System.out.println(solutionTime);
	}
	
	public static boolean canJumpMine(int[] nums) {
		int maxIndex = nums.length-1;
		int checkPointIndex = maxIndex; // индекс искомого промежуточного прыжка для достижения финиша 
		boolean manageable = false; // булево значение для определения возможности сделать прыжок до checkPoint
		
		while (checkPointIndex != 0) {
			for (int i = 0; i < checkPointIndex; i++) {
				if ((i + nums[i]) >= checkPointIndex) {
					checkPointIndex = i;
					manageable = true;
				}
			}
			if (manageable == false) {
				return false;
			}
			manageable = false;
		}
		return true;
	}
	
	// Второе решение
	public static boolean canJumpSecond(int[] nums) {
		
		int goal = nums.length - 1; 

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
	}
	
}
