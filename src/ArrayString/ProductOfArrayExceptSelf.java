package ArrayString;

import java.util.ArrayList;
import java.util.List;

/*
 * 238. Product of Array Except Self Очень важная концепция префиксных сумм!
 */
public class ProductOfArrayExceptSelf {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4}; // {24, 12, 8, 6}
		int n = nums.length;
        int pre[] = new int[n]; // {1,  1,  2, 6}
        int suff[] = new int[n]; //{   24, 12, 4, 1}
        pre[0] = 1;
        suff[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
            System.out.println(ans[i]);
        }
		
	}

}
